/**
 * 
 */
package habitat;

/**
 * @author Finiko
 *
 */
public final class Habitat {
  private int type;
  private int cage_number;
  
  void SetCageNumber(int cage_input){
	  cage_number=cage_input;
  }
  int GetCageNumber(){
	  return(cage_number);
  }
  int GetType(){
	  return(type);
  }
  void SetType(int type_input){
	  type=type_input;
  }
}
