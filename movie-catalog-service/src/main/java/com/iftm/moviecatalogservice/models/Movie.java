package com.iftm.moviecatalogservice.models;

public class Movie {

	private String movieId;
	private String name;
	
	public Movie() {super();}
	//para mesclar algo que não é um objeto com um objeto, é preciso ter um construtor vazio!
	//ele constroi um objeto vazio e vai populando com os elementos encontrados, um a um

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
