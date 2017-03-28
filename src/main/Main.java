/**
 * 
 */
package main;
import cell.Cell;
import pointer.Pointer;
import pointer.facility.Facility;
import pointer.facility.park.Park;
import pointer.facility.road.Road;
import pointer.facility.road.entrance.Entrance;
/**
 * @author Finiko
 *
 */

public class Main {
  public static void main(String[] args){
	Cell C=new Cell();
	int i,j;

	Entrance E=new Entrance(5,5);
	Road R=new Road(5,5);
	for(i=0;i<C.getSizeX();i++){
		for(j=0;j<C.getSizeY();j++){
			C.setPoint(i, j, new Park(i,j));
		}
	}
	//Facility F;
	Pointer P=new Pointer(3,5);
	Facility F= new Facility(3,5);
	System.out.println(C.getPoint(3,3).render());
	System.out.println(R.IsJalan());
	System.out.println(R.getPositionX());
	System.out.println(R.getPositionY());
  }
  
}
