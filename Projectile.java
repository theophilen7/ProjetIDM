import java.lang.Exception;

public class Projectile extends ElementJeu{
	
	private String name ;
	private Integer portee;
	private Float masse;
	private Float vitesse;
	private Float energie;
	private Integer x;
	private Integer y;

	
	public Projectile(String name, Integer portee, Float masse, Float vitesse, Float energy) {
		this.name = name;
		this.portee = portee;
		this.masse = masse;
		this.vitesse = vitesse;
		this.energie = energy;
		
		/*this.x = x;
		this.y = y;*/
	}
	
	public Float detruire(Integer mx,Integer my,Float menerg) throws CibleException, DestructionException {
		Integer dist ;
		if(this.x == mx) {
			dist = Math.abs(my-this.y);
		}
		else if (this.y == my) {
			dist = Math.abs(mx-this.x);
		}
		
		else {
			throw new CibleException("la cible n'est pas en face du projectile");
		}
		
		if (dist<=this.portee) {
			return (this.energie - menerg);
		}
		else {
			throw new DestructionException("L'energie du Projectile est épuisé avant l'atteinte de la cible");
		}
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}


	public Integer getPortee() {
		return portee;
	}
	public void setPortee(Integer portee) {
		this.portee = portee;
	}
	public Float getMasse() {
		return masse;
	}
	public void setMasse(Float masse) {
		this.masse = masse;
	}
	public Float getVitesse() {
		return vitesse;
	}
	public void setVitesse(Float vitesse) {
		this.vitesse = vitesse;
	}
	public Float getEnergie() {
		return energie;
	}
	public void setEnergie(Float energy) {
		this.energie = energy;
	}

}
