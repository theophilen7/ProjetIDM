  
import java.util.List;

public class Obstacle{
    String name;
    Float energieMax;
   // List<Projectile> projectile;
    Tactique tactique;
    Boolean case_campement;

    public Obstacle(String name,Float EM, /*List <Projectile> proj,*/ Tactique t ){
        this.name = name;
        //this.projectile = proj;
        this.energieMax = EM;
        this.tactique = t;
    }


    public String getName(){
        return this.name;
    }
    public Float getEnergieMax(){
        return this.energieMax;
    }

  /*  public List<Projectile> getProjectile() {
        return this.projectile;
    } */

    public Tactique getTactique() {
        return this.tactique;        
    }

    public void setName(String n ){
        this.name = n;
    }
    public void setEnergieMax(Float EM){
        this.energieMax= EM;
    }

  /*  public void getProjectile(List<Projectile> proj) {
        this.projectile = proj;
    } */

    public void setTactique(Tactique t) {
        this.tactique = t;        
    }

    public void Lancer(Obstacle depart , Obstacle cible) {
    	Float EM = depart.getEnergieMax() - cible.getEnergieMax();
    	if (EM > 0) {
    		depart.setEnergieMax(EM);
    	} else {
    		throw new CibleException("pas assez d'énérgie");
    	}
    	
    }


}