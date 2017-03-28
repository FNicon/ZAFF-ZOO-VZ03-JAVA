/**
 * 
 */
package pointer.facility.park;
import pointer.facility.Facility;
/**
 * @author Finiko
 *
 */
public class Park extends Facility{  
  public Park(int inputX, int inputY){
    super(inputX,inputY);
  }
  public boolean isPark(){
    return(true);
  }
  public char render(){
	  return('#');
  }
}
