/**
 * 
 */
package pointer.facility.road.entrance;
import pointer.facility.road.Road;
/**
 * @author Finiko
 *
 */
public class Entrance extends Road{
  private int x;
  private int y;
  
  public Entrance(int inputX,int inputY){
    super(inputX,inputY);
  }
  public boolean isEntrance(){
    return(true);
  }
  public char render(){
	  return('=');
  }
}
