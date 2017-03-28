/**
 * 
 */
package habitat.waterhabitat;
import habitat.Habitat;
/**
 * @author Finiko
 *
 */
public class WaterHabitat extends Habitat {
  public WaterHabitat(){
    setAbleType(1);
  }
  public char render(){
    return('~');
  }
}
