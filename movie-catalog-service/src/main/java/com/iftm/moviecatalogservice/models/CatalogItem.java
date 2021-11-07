package com.iftm.moviecatalogservice.models;

public class CatalogItem {

	private String name;
	private String desc;
	private int rating;

	//aqui indica como essa classe poderá ser acessada:
	public CatalogItem(String name, String desc, int rating) {
		super();
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}

	public CatalogItem() {super();}

	//aqui temos os métodos para pegar(get) e setar(set) informacoes
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getDesc() {return desc;}
	public void setDesc(String desc) {this.desc = desc;}
	public int getRating() {return rating;}
	public void setRating(int rating) {this.rating = rating;}
}
