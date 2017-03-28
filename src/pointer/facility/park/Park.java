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
  private int x;
  private int y;
  
  public Park(int inputX, int inputY){
    super(inputX,inputY);
    x=inputX;
    y=inputY;
  }
  public boolean isPark(){
    return(true);
  }
  public char render(){
	  return('P');
  }
}
