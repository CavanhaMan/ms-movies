package com.iftm.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.iftm.moviecatalogservice.models.CatalogItem;
import com.iftm.moviecatalogservice.models.Movie;
import com.iftm.moviecatalogservice.models.Rating;


@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        //return Collections.singletonList(new CatalogItem("Transformers", "Filme de Robo", 4));
        //esse retorno acima foi criado para ele retornar algo "a força" sendo que ainda não temos dados
    	
    	RestTemplate restTemplate = new RestTemplate();
    	//restTemplat.getForObject("http://localhost:8082/movies/foo", Movie.class);
    	//Sobre o restTemplate:
    	//o primeiro argumento faz uma chamada para o que vc quer chamar via rest
    	//o retorno é uma string
    	//ou seja, cria uma intancia de uma classe, enche de dados e devove um objeto formado.
    	//O segundo argumento seria o filme e a avaliacao (a classe de onde vai puxar que gerará o novo objeto)
    	//- vamos copiar a classe Movie para esta projeto para usar as funcoes já implementadas
    	//tecnicamente deveria ser criado uma "call" dessas para cada filme avaliado
    	//essa função será movida para dentro do retorno para enfim trazer um retorno real
    	//fazendo com que o micro service funcione de verdade
    	
    	List<Rating> ratings = Arrays.asList(
    		new Rating("1234",4),//fake data para testar
    		new Rating("4567",3)//traz um ID e uma avaliação
    	);
    	
    	return ratings.stream().map(rating -> {
    		Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
    		//como dito acima, esta linha vai agora pegar cada avaliação de cada filme (atraves do getMovidId)
    		//new CatalogItem("Transformers", "Filme de Robooo", 4))
    		//agora eu removo o retorno falso para buscar algo real:
    		return new CatalogItem(movie.getName(), "Description", rating.getRating());
        })
        .collect(Collectors.toList());
    			
    	//2) Para cada movid ID, chamar movie info service e get details
    	
    	
    	//3) Colocar tudo junto
    	
        //return Collections.singletonList(new CatalogItem("Transformers", "Filme de Robo", 4));
    }
}
//A montagem do teste para esta clase será usando o /catalog e o userId
//Ou seja, no POSTMAN, inserir a chamada:
//http://localhost:8082/catalog/foo