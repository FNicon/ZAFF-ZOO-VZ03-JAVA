/**
 * 
 */
package pointer;

/**
 * @author Finiko
 *
 */
public abstract class Pointer {
  //private E type;
  private int positionX;
  private int positionY;
  
  public Pointer(int x, int y){
	  positionX=x;
	  positionY=y;
  }
  public int getPositionX(){
	  return(positionX);
  }
  public int getPositionY(){
	  return(positionY);
  }
/*  public E getType(){
	  return(type);
  }
  public void setType(E inputType){
	  type=inputType;
  }*/
  
}
