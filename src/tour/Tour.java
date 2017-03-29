/**
 * 
 */
package tour;

import cell.Cell;
import java.util.Scanner;
import pointer.Pointer;
import cage.Cage;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Tour.java
 * Tanggal : 28 Maret 2017
 */
public class Tour {
  /**
   * nowX adalah posisi x sekarang dari tour
   */
  private int nowX;
  /**
   * nowY adalah posisi y sekarang dari tour
   */
  private int nowY;
  /**
   * constructor
   * @param zoo
   */
  public Tour(Cell zoo){
	Pointer nowLocation;
    nowLocation=searchEntrance(zoo);
    nowX=nowLocation.getPositionX();
    nowY=nowLocation.getPositionY();
  }
  /**
   * Mencari lokasi entrance pada zoo
   * @param zoo
   * @return Pointer yang berupa entrance
   */
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
  /**
   * bergerak ke kiri
   * @param zoo
   * @return Pointer lokasi kiri dari posisi sekarang
   */
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
  /**
   * bergerak ke kanan
   * @param zoo
   * @return Pointer lokasi kanan dari posisi sekarang
   */
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
  /**
   * bergerak ke atas
   * @param zoo
   * @return Pointer lokasi atas dari posisi sekarang
   */
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
  /**
   * bergerak ke bawah
   * @param zoo
   * @return Pointer lokasi bawah dari posisi sekarang
   */
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
  /**
   * mengecek apakah diatas ada habitat
   * @param zoo
   * @return true jika diatas dari posisi sekarang adalah habitat. false jika bukan
   */
  public boolean checkUpHabitat(Cell zoo){
    return((zoo.getPoint(nowX,nowY-1)).isHabitat());
  }
  /**
   * mengecek apakah dibawah ada habitat
   * @param zoo
   * @return true jika dibawah dari posisi sekarang adalah habitat. false jika bukan
   */
  public boolean checkDownHabitat(Cell zoo){
    return((zoo.getPoint(nowX,nowY+1)).isHabitat());
  }
  /**
   * mengecek apakah dikiri ada habitat
   * @param zoo
   * @return true jika dikiri dari posisi sekarang adalah habitat. false jika bukan
   */
  public boolean checkLeftHabitat(Cell zoo){
    return((zoo.getPoint(nowX-1,nowY)).isHabitat());
  }
  /**
   * mengecek apakah di kanan ada habitat
   * @param zoo
   * @return true jika dikanan dari posisi sekarang adalah habitat. false jika bukan
   */
  public boolean checkRightHabitat(Cell zoo){
    return((zoo.getPoint(nowX+1,nowY)).isHabitat());
  }
  /**
   * melihat habitat dari Pointer yang akan dicek
   * @param check
   * @param zoo
   */
  public void seeHabitat(Pointer check, Cell zoo){
    int number;
    Cage tempListCage[];
    number=check.getHabitat().getCageNumber();
    tempListCage=zoo.getListCage();
    tempListCage[number].experienceHewan();
  }
  /**
   * melihat keadaan sekitar dari posisi sekarang
   * @param zoo
   */
  public void checkSurrounding(Cell zoo){
    if(nowY>0){
      if(checkUpHabitat(zoo)){
        System.out.println("Di atas, ");
        seeHabitat(zoo.getPoint(nowX, nowY-1),zoo);
      }
    }
    if(nowX>0){
      if(checkLeftHabitat(zoo)){
        System.out.println("Di kiri, ");
        seeHabitat(zoo.getPoint(nowX-1, nowY),zoo);    	
      }
    }
    if(nowX+1<zoo.getSizeX()){
      if(checkRightHabitat(zoo)){
        System.out.println("Di kanan, ");
        seeHabitat(zoo.getPoint(nowX+1, nowY),zoo);
      }
    }
    if(nowY+1<zoo.getSizeY()){
      if(checkDownHabitat(zoo)){
        System.out.println("Di bawah, ");
        seeHabitat(zoo.getPoint(nowX, nowY+1),zoo);
      }
    }
  }
  /**
   * bergerak hingga ke exit
   * @param zoo
   */
  public void gerak(Cell zoo){
    Scanner input;
    char inputscan;
    input=new Scanner(System.in);
    inputscan=input.next().charAt(0);
    while(!(zoo.getPoint(nowX,nowY).isExit())){
      System.out.print(nowX);
      System.out.print(",");
      System.out.print(nowY);
      System.out.println("Pilih Jalan(w:atas.s:bawah,a:kiri,d:kanan)");
      checkSurrounding(zoo);
      if(inputscan=='w'){
        moveAtas(zoo);
      }else if(inputscan=='s'){
        moveBawah(zoo);
      }else if(inputscan=='d'){
        moveKanan(zoo);
      }else if(inputscan=='a'){
        moveKiri(zoo);
      }
      input=new Scanner(System.in);
      inputscan=input.next().charAt(0);
    }
  }
}
