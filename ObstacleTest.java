import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class ObstacleTest {
	public static Obstacle o;
	
	 @Before
	 public static void setUp() throws Exception {
		 o = new Obstacle("obs",120.F , /*List <Projectile> proj,*/ Tactique.plusfaible);
	 }
	 
	@Test
	void testGetName() {
		assertEquals(o.getName(), "obs");
	}

	@Test
	void testGetEnergieMax() {
		assertEquals(o.getEnergieMax(), 120.F);	
	}

	@Test
	void testGetTactique() {
		assertEquals(o.getTactique(), Tactique.plusfaible);	
	}

	@Test
	void testSetNameString() {
		o.setName("obs1");
		assertNotEquals(o.getName(), "obs");
		assertEquals(o.getName(), "obs1");
	}

	@Test
	void testSetEnergieMaxFloat() {
		o.setEnergieMax(150.F);
		assertNotEquals(o.getEnergieMax(), 120.F);
		assertEquals(o.getEnergieMax(), 150.F);
	}

	@Test
	void testSetTactiqueTactique() {
		o.setTactique(Tactique.plusfort);
		assertEquals(o.getTactique(), Tactique.plusfort);
		assertNotEquals(o.getTactique(),Tactique.plusfaible);
	}

}
