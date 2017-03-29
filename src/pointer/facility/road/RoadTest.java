/**
 * 
 */
package pointer.facility.road;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 *
 */
public class RoadTest {
  @Test
  void render() {
    Road R;
    assertTrue(R.render()=='-');
  }
}
