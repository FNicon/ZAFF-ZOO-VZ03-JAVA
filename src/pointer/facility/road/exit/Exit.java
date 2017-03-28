/**
 * 
 */
package pointer.facility.road.exit;
import pointer.facility.road.Road;
/**
 * @author Finiko
 *
 */
public class Exit extends Road {
  private int x;
  private int y;  
  
  public Exit(int inputX,int inputY){
    super(inputX,inputY);
  }
  public boolean isExit(){
    return(true);
  }
}
