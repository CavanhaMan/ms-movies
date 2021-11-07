package com.iftm.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie(movieId, "Test name");
		//esse retorno foi criado para ele retornar algo "a força" sendo que ainda não temos dados
	}
	
}
//A montagem do teste para esta clase será usando o /catalog e o movieId
//Ou seja, no POSTMAN, inserir a chamada:
//http://localhost:8082/movies/foo