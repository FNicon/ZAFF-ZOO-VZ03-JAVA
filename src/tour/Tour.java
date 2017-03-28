/**
 * 
 */
package tour;

import cell.Cell;
import pointer.Pointer;
import habitat.Habitat;
import cage.Cage;
/**
 * @author Finiko
 *
 */
public class Tour {
  private int nowX;
  private int nowY;
  
  public Tour(Cell zoo){
	Pointer nowLocation;
    nowLocation=searchEntrance(zoo);
    nowX=nowLocation.getPositionX();
    nowY=nowLocation.getPositionY();
  }
  public Pointer searchEntrance(Cell zoo){
    int x,y;
    x=0;
    y=0;
    while((!(zoo.getPoint(x,y).isEntrance()))&&(y<zoo.getSizeY())){
      x=x+1;
      if(x>=zoo.getSizeX()){
        y=y+1;
        x=0;
      }
    }
    return(zoo.getPoint(x, y));
  }
  public Pointer moveKiri(Cell zoo){
    Pointer nowLocation;
    nowLocation=zoo.getPoint(nowX,nowY);
    if (nowX-1>0){
      if(zoo.getPoint(nowX-1,nowY).isJalan()){
        nowLocation=zoo.getPoint(nowX-1,nowY);
        nowX=nowX-1;
      }
    }
    return(nowLocation);
  }
  public Pointer moveKanan(Cell zoo){
    Pointer nowLocation;
    nowLocation=zoo.getPoint(nowX,nowY);
    if (nowX+1<zoo.getSizeX()){
      if(zoo.getPoint(nowX+1,nowY).isJalan()){
        nowLocation=zoo.getPoint(nowX+1,nowY);
        nowX=nowX+1;
      }
    }
    return(nowLocation);
  }
  public Pointer moveAtas(Cell zoo){
    Pointer nowLocation;
    nowLocation=zoo.getPoint(nowX,nowY-1);
    if (nowY-1>0){
      if(zoo.getPoint(nowX,nowY-1).isJalan()){
        nowLocation=zoo.getPoint(nowX,nowY-1);
        nowY=nowY-1;
      }
    }
    return(nowLocation);
  }
  public Pointer moveBawah(Cell zoo){
    Pointer nowLocation;
    nowLocation=zoo.getPoint(nowX,nowY+1);
    if (nowY+1<zoo.getSizeX()){
      if(zoo.getPoint(nowX,nowY+1).isJalan()){
        nowLocation=zoo.getPoint(nowX,nowY+1);
        nowY=nowY+1;
      }
    }
    return(nowLocation);
  }
  public boolean checkUpHabitat(Cell zoo){
    return((zoo.getPoint(nowX,nowY-1)).isHabitat());
  }
  public boolean checkDownHabitat(Cell zoo){
    return((zoo.getPoint(nowX,nowY+1)).isHabitat());
  }
  public boolean checkLeftHabitat(Cell zoo){
    return((zoo.getPoint(nowX-1,nowY)).isHabitat());
  }
  public boolean checkRightHabitat(Cell zoo){
    return((zoo.getPoint(nowX+1,nowY)).isHabitat());
  }
/*  public void seeHabitat(Pointer check, Cell zoo){
    int number;
    Cage tempListCage[];
    number=check.habitat.getCageNumber();
    tempListCage=zoo.getListCage();
    tempListCage[number].experienceHewan();
  }
  public void checkSurrounding(Cell zoo){
    if(checkUpHabitat(zoo)){
      System.out.println("Di atas, ");
      seeHabitat(zoo.getPoint(nowX, nowY-1),zoo);
    }
    if(checkLeftHabitat(zoo)){
      System.out.println("Di kiri, ");
      seeHabitat(zoo.getPoint(nowX-1, nowY),zoo);    	
    }
    if(checkRightHabitat(zoo)){
      System.out.println("Di kanan, ");
      seeHabitat(zoo.getPoint(nowX+1, nowY),zoo);
    }
    if(checkDownHabitat(zoo)){
      System.out.println("Di bawah, ");
      seeHabitat(zoo.getPoint(nowX, nowY+1),zoo);
    }
  }*/
  public void gerak(Cell zoo){
    String input;
    while(!(zoo.getPoint(nowX,nowY).isExit())){
      System.out.print("\f");
      System.out.print(nowX);
      System.out.print(",");
      System.out.print(nowY);
      //checkSurrounding(zoo);
      System.out.println("Pilih Jalan(w:atas.s:bawah,a:kiri,d:kanan)");
      input=System.console().readLine();
      if(input=="w"){
        moveAtas(zoo);
      }else if(input=="s"){
        moveBawah(zoo);
      }else if(input=="d"){
        moveKanan(zoo);
      }else if(input=="a"){
        moveKiri(zoo);
      }
    }
  }
}
