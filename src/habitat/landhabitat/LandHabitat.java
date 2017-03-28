/**
 * 
 */
package habitat.landhabitat;
import habitat.Habitat;
/**
 * @author Finiko
 *
 */
public class LandHabitat extends Habitat{
  public LandHabitat(){
    setAbleType(1);
  }
  public char render(){
    return('*');
  }
}
