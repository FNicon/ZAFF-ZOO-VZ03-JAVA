/**
 * 
 */
package habitat.airhabitat;
import habitat.Habitat;
/**
 * @author Finiko
 *
 */
public class AirHabitat extends Habitat {
  public AirHabitat(){
    setAbleType(1);
  }
  public char render(){
    return('^');
  }
}
