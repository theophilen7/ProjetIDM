package fr.n7.java;
import java.lang.Exception;

public class Projectile implements ElementJeu{
	
	private String name ;
	private int portee;
	private double masse;
	private double vitesse;
	private double energie;
	private int x;
	private int y;

	
	public Projectile(String name, int portee, double masse, double vitesse, double energy) {
		this.name = name;
		this.portee = portee;
		this.masse = masse;
		this.vitesse = vitesse;
		this.energie = energy;
		
		/*this.x = x;
		this.y = y;*/
	}
	
	public double detruire(Integer mx,Integer my,double menerg) throws DestructionException {
		
		double dist = Math.abs(my-this.y) + Math.abs(mx-this.x) ;	

		
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

	public void setX(int x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	public Integer getPortee() {
		return portee;
	}
	public void setPortee(int portee) {
		this.portee = portee;
	}
	public double getMasse() {
		return masse;
	}
	public void setMasse(double masse) {
		this.masse = masse;
	}
	public double getVitesse() {
		return vitesse;
	}
	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}
	public double getEnergie() {
		return energie;
	}
	public void setEnergie(double energy) {
		this.energie = energy;
	}

	/** Méthode renvoyant l nom de l'élement de jeu.
	 */
	@Override
	public String getName() {
		return this.name;
	}
	
	
	/** Methode qui modifie le nom d'un élement de jeu.
	 * @param nom
	 */
	@Override
	public void setName(String nom) {
		this.name = nom;
	}
}
