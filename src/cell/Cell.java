/**
 * 
 */
package cell;

/**
 * @author Finiko
 *
 */
import cage.Cage;
import pointer.Pointer;

public class Cell{
  /** ukuran x cell
    */
  private int sizeX;
  /** ukuran y cell
    */
  private int sizeY;

  private Pointer point[][];

  private Cage kandang[];

  private int jumlahKandang;

  /**  constructor
   *  I.S Cell tidak terdefinisi
   *  F.S Cell terdefinisi dengan ukuran default
   */
  public Cell(){
    sizeX=50;
    sizeY=50;
    int i,j;
    setCage(30);
    point =new Pointer [sizeX][sizeY];
    for (i=0; i<sizeX; i++){
      for(j=0; j<sizeY; j++){
        point[i][j] = new Pointer(i,j);
      }
    }
  }
  /** brief Constructor dengan parameter
   * @param inputX posisi X
   * @param inputY posisi Y
   * @param inputKandang jumlah kandang
   * I.S x,y, dan jumlah_kandang terdefinisi
   * F.S Cell terdefinisi dengan ukuran yang sesuai
   */
  public Cell(int inputX, int inputY, int inputKandang){
    sizeX=inputX;
    sizeY=inputY;
    int i,j;
    setCage(inputKandang);
    point =new Pointer [sizeX][sizeY];
    for (i=0; i<sizeX; i++){
      for(j=0; j<sizeY; j++){
        point[i][j] = new Pointer(i,j);
      }
    }
  }
  /**
   * Setter Cage
   * @param inputKandang jumlah kandang
   */
  public void setCage(int inputKandang){
    jumlahKandang = inputKandang;
    kandang = new Cage[jumlahKandang];
  }
  /**
   * Getter sizeX
   * @return sizeX
   */
  public int getSizeX(){
    return(sizeX);
  }
  /**
   * Getter sizeY
   * @return sizeY
   */
  public int getSizeY(){
    return(sizeY);
  }
  /**
   * @param inputX posisi X
   * @param inputY posisi Y
   * @return Pointer
   */
  public Pointer getPoint(int inputX, int inputY){
    return(point[inputX][inputY]);  
  }
  /**
   * @param inputX posisi X
   * @param inputY posisi Y
   * @param inputPoint jenis point
   * I.S x,y, dan jumlah_kandang terdefinisi
   * F.S Cell terdefinisi dengan ukuran yang sesuai
   */
  public void setPoint(int inputX, int inputY, Pointer inputPoint){
    point[inputX][inputY]=inputPoint;
  }
}
