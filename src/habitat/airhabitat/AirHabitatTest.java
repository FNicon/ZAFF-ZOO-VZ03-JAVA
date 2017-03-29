/**
 * 
 */
package habitat.airhabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Finiko
 *
 */
public class AirHabitatTest {
  @Test
  void getAbleType() {
    AirHabitat h=new AirHabitat();
    assertTrue(h.getAbleType()== 1);
  }
}
