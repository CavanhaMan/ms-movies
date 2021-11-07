package com.iftm.ratingsdataservice.model;

public class Rating {

    private String movieId;
    private int rating;

	//aqui indica como essa classe poderá ser acessada:
    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

	//aqui temos os métodos para pegar(get) e setar(set) informacoes
    public String getMovieId() {return movieId;}
    public void setMovieId(String movieId) {this.movieId = movieId;}
    public int getRating() {return rating;}
    public void setRating(int rating) {this.rating = rating;}
}