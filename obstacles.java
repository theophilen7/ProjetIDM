  

Obstacle returns Obstacle:
	{Obstacle}
	'Obstacle'
	name=EString
	energieMax = FLOAT
	projectile+=Projectile*
	tactique = TACTIQUES
	case_campement = [Case]   // contrainte ocl


public enum TACTIQUES{
    plusproche,
    plusfaible,
    plusfort;
}
public class Obstacle{
    String name;
    Float energieMax;
    List<Projectile> projectile;
    TACTIQUES tactique;
    Boolean case_campement;

    public Obstacle(String name,Float EM, List<Projectile> proj, TACTIQUES t ){
        this.name = name;
        this.projectile = proj;
        this.energieMax = EM;
        this.tactique = t;
    }


    public String getName(){
        return this.name;
    }
    public Float getEnergieMax(){
        return this.energieMax;
    }

    public List<Projectile> getProjectile() {
        return this.projectile;
    }

    public TACTIQUES getTactique() {
        return this.tactique;        
    }

    public void getName(String n ){
        this.name = n;
    }
    public void getEnergieMax(Float EM){
        this.energieMax= EM;
    }

    public void getProjectile(List<Projectile> proj) {
        this.projectile = proj;
    }

    public void getTactique(TACTIQUES t) {
        this.tactique = t;        
    }



}