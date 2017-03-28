/**
 * 
 */
package pointer.facility;
import pointer.Pointer;
/**
 * @author Finiko
 *
 */
public class Facility extends Pointer{
  private int facilityX;
  private int facilityY;
  
  public Facility(int inputX,int inputY){
    super(inputX,inputY);
    facilityX=inputX;
    facilityY=inputY;
  }
  public int getX(){
    return(facilityX);
  }
  public int getY(){
    return(facilityY);
  }
}
