import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class NatureTerrainTest {
	private static NatureTerrain terrain;
	
	 @Before
	 public static void setUp() throws Exception {
		 terrain = new NatureTerrain("terrain1", NatureTerrainType.decoration , 10, 100);
	 }

	@Test
	public void testGetName() {
		assertEquals(terrain.getName(), "terrain1");
	}

	@Test
	void testGetType() {
		assertEquals(terrain.getType(),NatureTerrainType.decoration);
	}

	@Test
	void testGetCout() {
		assertEquals(terrain.getCout(),10);
	}

	@Test
	void testGetVolume() {
		assertEquals(terrain.getVolume(),100);;
	}

	@Test
	void testSetName() {

		terrain.setName("terrain2");
		assertEquals(terrain.getName(), "terrain2");
	}

	@Test
	void testSetType() {
		terrain.setType(NatureTerrainType.chemin);
		assertEquals(terrain.getType(),NatureTerrainType.decoration);
	}

	@Test
	void testSetCout() {
		terrain.setCout(21);
		assertEquals(terrain.getCout(),10);
	}

	@Test
	void testSetVolume() {
		terrain.setVolume(300);
		assertEquals(terrain.getVolume(),300);
	}

}
