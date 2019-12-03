
public enum NatureTerrainType {
     entree,
     sortie,
     chemin,
     campement,
     decoration ;
}

public class NatureTerrain {
    String name;
    NatureTerrainType type;
    Int cout;
    Int volume;

    public NatureTerrain(String name, NatureTerrain type, int cout, int volume) {
        this.name = name;
        this.type = type;
        this.cout = cout;
        this.volume = volume
    }

    public String getName(){
        return this.name;
    }

    public NatureTerrain getType() {
        return this.type;
    }

    public int getCout() {
        return this.cout;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setName(String name) {
        this.name = name;        
    }

    public void setType(NatureTerrain type) {
        this.type = type;
    }

    public void setCout(int c){
        this.cout = c;
    }

    public void setVolume( int v){
        this.volume = v;
    }
}
