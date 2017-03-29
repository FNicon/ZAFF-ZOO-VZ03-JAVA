/**
 * 
 */
package pointer.facility.road.entrance;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Finiko
 *
 */
public class EntranceTest {
  @Test
  void render() {
    Entrance E;
    assertTrue(E.render()=='>');
  }
}
