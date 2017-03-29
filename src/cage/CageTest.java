/**
 * 
 */
package cage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Finiko
 *
 */
public class CageTest {
	@Test
	  void getJumlahMakanan(){
		Cage nowCage=new Cage(0,1);
	    assertTrue(nowCage.getJumlahMakan()==0);
	  }
	@Test
	  void getNumberCage(){
		Cage nowCage=new Cage(0,1);
	    assertTrue(nowCage.getNumberCage()==0);
	  }
}
