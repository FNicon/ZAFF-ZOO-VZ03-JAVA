/**
 * 
 */
package pointer.facility.road;
import pointer.facility.Facility;

/**
 * @author Finiko
 *
 */
public class Road extends Facility{
  private int type;

  public boolean IsJalan(){
    return(getType()==1);
  }
  public boolean IsEntrance(){
    return(type==1);
  }
  public boolean IsExit(){
	  return(type==0);
  }
}
