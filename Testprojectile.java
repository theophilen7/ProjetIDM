package fr.n7.java;

import org.junit.*; // for @Test

public class Testprojectile {
	
	Projectile p;
	@Before
	public void preparer() {
		p = new Projectile("p1",2,3,4.1,5.5);
		
	}
	
	@Test
	public void Testergetters() {
		Assert.assertTrue(5.5 == p.getEnergie());
		Assert.assertTrue(4.1 == p.getVitesse());
		Assert.assertTrue(3 == p.getMasse());
		Assert.assertTrue(2 == p.getPortee());
		Assert.assertTrue("p1".equalsIgnoreCase(p.getName()));
	}
	
	@Test
	public void Testersetters() {
		p.setEnergie(4.5);
		p.setMasse(5);
		p.setName("p2");
		p.setPortee(6);
		p.setVitesse(11);
		Assert.assertTrue(4.5 == p.getEnergie());
		Assert.assertTrue(11 == p.getVitesse());
		Assert.assertTrue(5 == p.getMasse());
		Assert.assertTrue(6 == p.getPortee());
		Assert.assertTrue("p2".equalsIgnoreCase(p.getName()));
	}
	@Test(expected = DestructionException.class)
	public void Testerdetruire() throws DestructionException {
		p.setX(0);
		p.setY(0);
		Assert.assertTrue(3 == p.detruire(1, 1, 2.5));
		
		//Exception
		Assert.assertTrue(3 == p.detruire(2, 2, 2.5));


	}

	
	

}
