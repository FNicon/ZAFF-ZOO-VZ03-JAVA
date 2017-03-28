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
  private int ableType;
  private int cageNumber;
  
  public void setCageNumber(int cageInput){
    cageNumber=cageInput;
  }
  public int getCageNumber(){
    return(cageNumber);
  }
  int getAbleType(){
    return(ableType);
  }
  public void setAbleType(int ableInput){
    ableType=ableInput;
  }
  public boolean isHabitat(){
    return(true);
  }
}
