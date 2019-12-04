import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CaseTest {

	private static Case c1;
		
	 @Before
	 public static void setUp() throws Exception {
		 c1 = new Case(3, 4, NatureTerrainType.entree);
	 }
		
	  @Test
	  public void testGetL(){
		  assertEquals(c1.getL(),4);
	    }
	  
	  @Test
	  public void testGetC() {
		  assertEquals(c1.getC(), 3);
	    }
	  
	  @Test
	  public void testGetNature() {
		  assertEquals( c1.getNature(), NatureTerrainType.entree);
	    }
	  
	  @Test
	  public void testSetL(int l){
	       c1.setL(2020);
	       assertEquals(c1.getL(), 2020);
	    }

	  @Test
	  public void testSetC(int c){
	       c1.setL(2020);
	       assertEquals(c1.getC(), 2020);
	    }
	  @Test
	  public void testSetNature(NatureTerrain n){
		  c1.setNature(NatureTerrainType.chemin); 
	      assertEquals(c1.getNature(), NatureTerrainType.chemin);

		  c1.setNature(NatureTerrainType.decoration) ; 
	      assertEquals(c1.getNature(), NatureTerrainType.decoration);
	      

		  c1.setNature(NatureTerrainType.sortie ); 
	      assertEquals(c1.getNature(), NatureTerrainType.sortie);
	      
	    }
}
