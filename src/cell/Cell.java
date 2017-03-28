/**
 * 
 */
package cell;

/**
 * @author Finiko
 *
 */
import pointer.Pointer;

public class Cell{
  /** ukuran x cell
    */
  private int sizeX;
  /** ukuran y cell
    */
  private int sizeY;
  private Pointer point[][];
  /** @brief constructor
   *  @I.S Cell tidak terdefinisi
   *  @F.S Cell terdefinisi dengan ukuran default
   */
  public Cell(){
    int i;
    Pointer point[][] =new Pointer [20][];
    for (i=0;i<20;i++){
      point[i]=new Pointer[20];
    }
  }
  /** @brief Constructor dengan parameter
   * 
   * @param x
   * @param y
   * @param jumlah_kandang
   * @I.S x,y, dan jumlah_kandang terdefinisi
   * @F.S Cell terdefinisi dengan ukuran yang sesuai
   */
  public Cell(int inputX, int inputY, int jumlahKandang){
    sizeX=inputX;
    sizeY=inputY;
    int i;
    Pointer point[][]=new Pointer[sizeX][];
    for(i=0;i<sizeX;i++){
      point[i]=new Pointer[sizeY];
    }
  }
  /** @brief 
   * 
   */
  public void setCage(){
	  
  }
  public int getSizeX(){
    return(sizeX);
  }
  public int getSizeY(){
    return(sizeY);
  }
  public Pointer getPoint(int inputX, int inputY){
    return(point[inputX][inputY]);  
  }
  /* 
   * @param inputX
   * @param inputY
   * @I.S x,y, dan jumlah_kandang terdefinisi
   * @F.S Cell terdefinisi dengan ukuran yang sesuai
   */
  public void setPoint(int inputX, int inputY, Pointer inputPoint){
    point[inputX][inputY]=inputPoint;
  }
}
