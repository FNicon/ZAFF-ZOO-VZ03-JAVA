/**
 * 
 */
package pointer;
import render.Render;
import habitat.Habitat;
/**
 * @author Finiko
 * Nama : Finiko Kasula Novenda
 * NIM : 13515029
 * Nama File : Pointer.java
 * Tanggal : 28 Maret 2017
 */
public class Pointer extends Render{
  /**
   * positionX adalah posisi X dari Pointer
   */
  private int positionX;
  /**
   * positionY adalah posisi y dari Pointer
   */
  private int positionY;
  /**
   * dataHabitat adalah habitat pada posisi pointer 
   */
  private Habitat dataHabitat;
  /**
   * constructor
   */
  public Pointer(){
  }
  /**
   * constructor
   * @param inputX
   * @param inputY
   * I.S : Pointer tidak terdefinisi
   * F.S : Pointer terdefinisi dengan positionX adalah inputX dan positionY adalaj inputY
   */
  public Pointer(int inputX, int inputY){
    positionX=inputX;
    positionY=inputY;
  }
  /**
   * setter untuk dataHabitat
   * @param inputHabitat
   * I.S : dataHabitat tidak terdefinisi
   * F.S : dataHabitat terdefinisi
   */
  public void setHabitat(Habitat inputHabitat){
    dataHabitat=inputHabitat;
  }
  /**
   * setter untuk positionX
   * @param inputX
   * I.S : 
   */
  public void setPositionX(int inputX){
    positionX=inputX;
  }
  /**
   * setter untuk positionY
   * @param inputY
   */
  public void setPositionY(int inputY){
    positionY=inputY;
  }
  /**
   * 
   * @return
   */
  public Habitat getHabitat(){
    return(dataHabitat);
  }
  /**
   * 
   * @return
   */
  public int getPositionX(){
    return(positionX);
  }
  /**
   * 
   * @return
   */
  public int getPositionY(){
    return(positionY);
  }
  /**
   * 
   * @return
   */
  public boolean isJalan(){
    return(false);
  }
  /**
   * 
   * @return
   */
  public boolean isEntrance(){
    return(false);
  }
  public boolean isExit(){
    return(false);
  }
  /**
   * 
   * @return
   */
  public boolean isPark(){
    return(false);
  }
  /**
   * 
   * @return
   */
  public boolean isRestaurant(){
    return(false);
  }
  /**
   * 
   * @return
   */
  public boolean isHabitat(){
    return(false);
  }
}
