/**
 * 
 */
package main;
import cell.Cell;
import pointer.Pointer;
import pointer.facility.Facility;
import pointer.facility.park.Park;
import pointer.facility.restaurant.Restaurant;
import pointer.facility.road.Road;
import pointer.facility.road.entrance.Entrance;
import pointer.facility.road.exit.Exit;
import habitat.landhabitat.LandHabitat;
import habitat.waterhabitat.WaterHabitat;
import habitat.airhabitat.AirHabitat;
import tour.Tour;
import cage.Cage;
import animal.amphibi.cryptobranchidae.Salamander;
/**
 * @author Finiko
 *
 */

public class Main {
  public static void main(String[] args){
    Salamander sal=new Salamander();
    Cage kandang=new Cage(1,2);
    Cell zoo=new Cell();
    int i,j;
    String input;
    for(i=0;i<zoo.getSizeX();i++){
      for(j=0;j<zoo.getSizeY();j++){
        zoo.setPoint(i,j,new LandHabitat());
      }
    }
    zoo.setPoint(1,0, new Entrance(1,0));
    zoo.setPoint(19,19, new Exit(19,19));
    for(i=1;i<zoo.getSizeY()-1;i++){
      zoo.setPoint(1,i,new Road(1,i));
    }
    for(i=1;i<zoo.getSizeX()-1;i++){
      zoo.setPoint(i,zoo.getSizeY()-1,new Road(i,zoo.getSizeY()-1));
    }
    zoo.setPoint(0,0, new Park(0,0));
    zoo.setPoint(2,0, new Restaurant(2,0));
    for(i=2;i<zoo.getSizeX();i++){
        zoo.setPoint(i,18, new WaterHabitat());	
    }
    zoo.setCage(kandang);
    kandang.addHabitat(zoo.getPoint(3,3).getHabitat());
    //kandang.addHewan(sal,0,0);
    System.out.println("Selamat datang di ZaffZoo");
    System.out.println("Menu yang tersedia: ");
    System.out.println("1. Display Virtual Zoo");
    System.out.println("2. Tour Virtual Zoo");
    System.out.println("3. Display Makanan Total");
    System.out.println("4. Exit Zoo");
    System.out.println("Masukkan menu pilihan : ");
    //input=System.console().readLine();
    //input="1"
    /*do{
      if (input == "1"){
        zoo.gambar();
      }
      else if (input == "2"){
        Tour tour=new Tour(zoo);
        tour.gerak(zoo);
      }
      else if (input == "3")
      {
        System.out.print("Jumlah makanan yang dibutuhkan adalah : ");
        System.out.println(zoo.getMakananTotal());
      }
    } while (input !="4");*/
    zoo.gambar();
  }  
}
