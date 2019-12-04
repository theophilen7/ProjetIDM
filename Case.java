
public class Case{
    int L;
    int C;
    NatureTerrainType nature;

    public Case(int l, int c, NatureTerrainType n){
        this.L = l;
        this.C = c;
        this.nature = n;
    }

    public int getL(){
        return this.L;
    }

    public int getC() {
        return this.C;
    }

    public NatureTerrainType getNature() {
        return this.nature;
    }

    public void setL(int l){
        this.L = l;
    }

    public void setC(int c){
        this.C=c;
    }

    public void setNature(NatureTerrainType n){
        this.nature = n;
    }
}
