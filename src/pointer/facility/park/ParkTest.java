/**
 * 
 */
package pointer.facility.park;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Finiko
 *
 */
public class ParkTest {
  @Test
  void render() {
    Park P;
    assertTrue(P.render()=='#');
  }
}
