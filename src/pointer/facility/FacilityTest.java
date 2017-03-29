/**
 * 
 */
package pointer.facility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 *
 */
public class FacilityTest {
  @Test
  void getX(){
    Facility F= new Facility(0,0);
    assertTrue(F.getX()==0);
  }
  @Test
  void getY(){
    Facility F= new Facility(0,0);
    assertTrue(F.getY()==0);
  }
}
