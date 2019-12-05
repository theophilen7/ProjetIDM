package fr.n7.java;

public class Niveau {

	private String name;
	private double dureepause;
	private double energie;
	private int nbmobiles;
	

	public Niveau(String name, double dureepause, double energie, int nbmobiles) {
		this.name = name;
		this.dureepause = dureepause;
		this.energie = energie;
		this.nbmobiles = nbmobiles;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDureepause() {
		return dureepause;
	}
	public void setDureepause(double dureepause) {
		this.dureepause = dureepause;
	}
	public double getEnergie() {
		return energie;
	}
	public void setEnergie(double energie) {
		this.energie = energie;
	}
	public int getNbmobiles() {
		return nbmobiles;
	}
	public void setNbmobiles(int nbmobiles) {
		this.nbmobiles = nbmobiles;
	}



}
