TowerDefense exemple_sujet {
	NatureTerrain montagne decoration
	NatureTerrain route chemin 1 1
	NatureTerrain garage campement
	NatureTerrain E entree
	NatureTerrain S sortie
	Projectile P portee 1 masse 1 vitesse 1 energie 1
	Mobile M {
		volume 0.0
		energie 1.0
		vitesse 1.0
		plusproche
	}
	Obstacle O energie 1 plusfaible {P}
	Partie partie1 {
		Terrain 3 x 5 {
			Case 1 x 1 montagne
			Case 1 x 2 montagne
			Case 1 x 3 montagne
			Case 1 x 4 montagne
			Case 1 x 5 montagne
			Case 2 x 1 E
			Case 2 x 2 route
			Case 2 x 3 route
			Case 2 x 4 route
			Case 2 x 5 S
			Case 3 x 1 garage
			Case 3 x 2 garage
			Case 3 x 3 garage
			Case 3 x 4 garage
			Case 3 x 5 garage
		}
		Niveau N pause 1 energie 0 vie 2
		Vague V energie rendue 3 mobiles {
			M
			M
			M
		} obstacles {
			O
		}
	}
}