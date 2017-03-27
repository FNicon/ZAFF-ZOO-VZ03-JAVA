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
  private int type;
  private static int x;
  private static int y;

  public Facility(){
    super(x,y);
    type=1;
  }
  public int getType(){
    return(type);
  }
  public void SetType(int input_type){
    type=input_type;
  }
}
