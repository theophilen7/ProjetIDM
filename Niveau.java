
public class Niveau {

	private String name;
	private Float dureepause;
	private Float energie;
	private Integer nbmobiles;
	

	public Niveau(String name, Float dureepause, Float energie, Integer nbmobiles) {
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
	public Float getDureepause() {
		return dureepause;
	}
	public void setDureepause(Float dureepause) {
		this.dureepause = dureepause;
	}
	public Float getEnergie() {
		return energie;
	}
	public void setEnergie(Float energie) {
		this.energie = energie;
	}
	public Integer getNbmobiles() {
		return nbmobiles;
	}
	public void setNbmobiles(Integer nbmobiles) {
		this.nbmobiles = nbmobiles;
	}



}
