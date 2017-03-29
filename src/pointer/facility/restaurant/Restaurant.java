/**
 * 
 */
package pointer.facility.restaurant;
import pointer.facility.Facility;
/**
 * @author Finiko
 *
 */
public class Restaurant extends Facility {
  int x;
  int y;
  
  public Restaurant(int x, int y){
	super(x,y);  
  }
  public boolean isRestaurant(){
	  return(true);
  }
  public char render(){
	  return('@');
  }
}
