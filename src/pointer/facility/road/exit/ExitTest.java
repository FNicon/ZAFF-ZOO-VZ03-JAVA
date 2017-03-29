/**
 * 
 */
package pointer.facility.road.exit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Finiko
 *
 */
public class ExitTest {
  @Test
  void render() {
    Exit E;
    assertTrue(E.render()=='<');
  }
}
