import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

// Affiche le terrain, et les action de la souris (implementer ajouter tour) mais pas les Elements de jeu, a faire

public class Afficheur {
	int longueur;
	int largeur;
	JLabel[][] images;
	Case[][] cases;
	
	public Afficheur (String nomJeu, Case[][] terrain, int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.images = new JLabel[longueur][largeur];
		this.cases = terrain;
		
		JFrame fenetre = new JFrame(nomJeu);
		fenetre.setLayout(new GridLayout(this.longueur,this.largeur));

		for (int i=0;i<this.longueur; i++) {
			for (int j=0; j<this.largeur;j++) {
				images[i][j] = new JLabel(new ImageIcon(this.cases[i][j].getImage()));//, JLabel.CENTER);
				fenetre.getContentPane().add(images[i][j]);
				if (this.cases[i][j].getNature() == NatureTerrainType.campement) {
					images[i][j].addMouseListener(new Campement(this, this.cases, this.images, this.longueur, this.largeur));
				}
			}
		}
		
		fenetre.setSize(this.largeur*100,this.longueur*100 + 28);
		fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	    fenetre.setLocation(dim.width/2 - fenetre.getWidth()/2, dim.height/2 - fenetre.getHeight()/2);
		fenetre.setVisible(true);
		fenetre.setResizable(false);
	}
	
	public void actualiser() {
		for (int i=0;i<this.longueur;i++) {
			for (int j=0;j<this.largeur;j++) {
				List<ElementJeu> elements = this.cases[i][j].getElementJeu();
				if (elements.size() != 0) {
					//TODO superposer l'image de l'element et celui de l'element de jeu
				}
				this.images[i][j].setIcon( new ImageIcon(this.cases[i][j].getImage()));
			}
		}
	}
	
	private class Campement implements MouseListener {
		Afficheur afficheur;
		Case[][] cases;
		JLabel[][] images;
		int longueur;
		int largeur;
		
		public Campement(Afficheur a, Case[][] cases, JLabel[][] images, int longueur, int largeur) {
			this.afficheur = a;
			this.cases = cases;
			this.images = images;
			this.longueur = longueur;
			this.largeur = largeur;
		}
		
		public void mouseClicked (MouseEvent e) {
			int i = -1;
			int j = -1;
			for (int i_test=0; i_test<this.longueur; i_test++) {
				for (int j_test=0; j_test<this.largeur; j_test++) {
					if (this.images[i_test][j_test] == e.getComponent()) {
						i = i_test;
						j = j_test;
					}
				}
			}
			this.cases[i][j].placerTour();
			this.afficheur.actualiser();
		}
		
		public void mouseEntered (MouseEvent e) {}
		
		public void mouseExited (MouseEvent e) {}
		
		public void mousePressed (MouseEvent e) {}
		
		public void mouseReleased (MouseEvent e) {}
	}
}
