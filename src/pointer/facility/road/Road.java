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
  public Road(int x,int y){
    super(x,y);
  }
  public boolean isJalan(){
    return(true);
  }
  public char render(){
	  return('-');
  }
}
