/**
 * 
 */
package habitat;
import pointer.Pointer;

/**
 * @author Finiko
 *
 */
public class Habitat extends Pointer {
  private int type;
  private int cageNumber;
  
  public void setCageNumber(int cageInput){
	  cageNumber=cageInput;
  }
  public int getCageNumber(){
	  return(cageNumber);
  }
  int getType(){
	  return(type);
  }
  public void setType(int type_input){
	  type=type_input;
  }
  public boolean isHabitat(){
	  return(true);
  }
}
