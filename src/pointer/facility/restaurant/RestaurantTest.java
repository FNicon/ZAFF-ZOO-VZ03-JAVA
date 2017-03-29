/**
 * 
 */
package pointer.facility.restaurant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Finiko
 *
 */
public class RestaurantTest {
  @Test
  void render() {
    Restaurant R;
    assertTrue(R.render()=='@');
  }
}
