package com.iftm.ratingsdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.ratingsdataservice.model.Rating;
import com.iftm.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {return new Rating(movieId, 4);}
      //esse retorno (API endpoint) foi criado para ele retornar algo "a força" sendo que ainda não temos dados

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
    	List<Rating> ratings = Arrays.asList(
        		new Rating("1234",4),//fake data para testar
        		new Rating("4567",3)//traz um ID e uma avaliação
        	);//a versão final nao pode retornar uma lista = SEMPRE deve ser um objeto!
    	UserRating userRating = new UserRating();
    	userRating.setUserRating(ratings);
    	return userRating;
    }//esse retorno (API endpoint) foi criado para ele retornar algo "a força" sendo que ainda não temos dados

}
//A montagem do teste para esta clase será usando o /ratingsdata e o movieID
//Ou seja, no POSTMAN, inserir a chamada:
//http://localhost:8083/ratingsdata/foo