import java.util.ArrayList;
import java.util.List;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Case{
    int L;
    int C;
    NatureTerrainType nature;
    List<ElementJeu> elements;
    BufferedImage image;

    public Case(int l, int c, NatureTerrainType n){
        this.L = l;
        this.C = c;
        this.nature = n;
        this.elements = new ArrayList<ElementJeu>();
        this.image = ImageIO.read(new File("carre_blanc.png"));
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
    
    public List<ElementJeu> getElementJeu() {
    	return this.elements;
    }

    public BufferedImage getImage() {
    	return this.image;
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
    
    //TODO a faire pour placer une tour
    public void placerTour() {
    	System.out.println("commande recue");
    }
}
