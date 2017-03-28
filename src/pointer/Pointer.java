/**
 * 
 */
package pointer;

/**
 * @author Finiko
 *
 */
public class Pointer {
  private int positionX;
  private int positionY;
  
  public Pointer(){
  }
  public Pointer(int inputX, int inputY){
    positionX=inputX;
    positionY=inputY;
  }
  public int getPositionX(){
    return(positionX);
  }
  public int getPositionY(){
    return(positionY);
  }
}
