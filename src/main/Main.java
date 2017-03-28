/**
 * 
 */
package main;
import cell.Cell;
import pointer.Pointer;
import pointer.facility.Facility;
import pointer.facility.road.Road;
/**
 * @author Finiko
 *
 */

public class Main {
  public static void main(String[] args){
	Cell C;
	C=new Cell();
	//Facility F;
	//Pointer P=new Pointer(3,5);
	//Facility F= new Facility();
	Road R=new Road(3,5);
	C.setPoint(5, 5, new Pointer(5,5));
	System.out.println(R.IsJalan());
	System.out.println(R.getPositionX());
	System.out.println(R.getPositionY());
  }
  
}
