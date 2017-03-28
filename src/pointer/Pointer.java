/**
 * 
 */
package pointer;
import render.Render;
/**
 * @author Finiko
 *
 */
public class Pointer extends Render{
  private int positionX;
  private int positionY;
  public Pointer(){
  }
  public Pointer(int inputX, int inputY){
    positionX=inputX;
    positionY=inputY;
  }
  public void setPositionX(int inputX){
    positionX=inputX;
  }
  public void setPositionY(int inputY){
    positionY=inputY;
  }
  public int getPositionX(){
    return(positionX);
  }
  public int getPositionY(){
    return(positionY);
  }
  public boolean isJalan(){
    return(false);
  }
  public boolean isEntrance(){
    return(false);
  }
  public boolean isExit(){
    return(false);
  }
  public boolean isPark(){
    return(false);
  }
  public boolean isRestaurant(){
    return(false);
  }
  public boolean isHabitat(){
    return(false);
  }
}
