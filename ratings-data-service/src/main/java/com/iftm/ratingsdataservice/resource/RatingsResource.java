package com.iftm.ratingsdataservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.ratingsdataservice.model.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
      //esse retorno foi criado para ele retornar algo "a força" sendo que ainda não temos dados
    }
}
//A montagem do teste para esta clase será usando o /ratingsdata e o movieID
//Ou seja, no POSTMAN, inserir a chamada:
//http://localhost:8083/ratingsdata/foo