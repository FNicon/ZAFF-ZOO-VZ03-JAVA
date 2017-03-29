/**
 * 
 */
package habitat.landhabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 *
 */
public class LandHabitatTest {
  @Test
  void getAbleType() {
    LandHabitat h=new LandHabitat();
    assertTrue(h.getAbleType()== 1);
  }
}
