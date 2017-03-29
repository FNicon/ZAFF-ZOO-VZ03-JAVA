/**
 * 
 */
package habitat.waterhabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 *
 */
public class WaterHabitatTest {
  @Test
  void getAbleType() {
    WaterHabitat h=new WaterHabitat();
    assertTrue(h.getAbleType()== 1);
  }
}
