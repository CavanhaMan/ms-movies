package com.iftm.movieinfoservice.models;

public class Movie {

	private String movieId;
	private String name;
	
	//aqui indica como essa classe poderá ser acessada:
	public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	
	//aqui temos os métodos para pegar(get) e setar(set) informacoes
	public String getMovieId() {return movieId;}
	public void setMovieId(String movieId) {this.movieId = movieId;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	
}
