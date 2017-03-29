/**
 * 
 */
package cell;

/**
 * @author Finiko
 *
 */
import pointer.Pointer;
import cage.Cage;

public class Cell{
  /** ukuran x cell
    */
  private int sizeX;
  /** ukuran y cell
    */
  private int sizeY;
  private Pointer point[][];
  private Cage listCage[];
  private int jumlahCage;
  private int counterCage;
  
  /** @brief constructor
   *  @I.S Cell tidak terdefinisi
   *  @F.S Cell terdefinisi dengan ukuran default
   */
  public Cell(){
    sizeX=20;
    sizeY=20;
    int i,j;
    point = new Pointer[sizeX][sizeY];
    for(i=0;i<sizeX;i++){
      for(j=0;j<sizeY;j++){
        point[i][j]=new Pointer(i,j);
      }
    }
    jumlahCage=2;
    listCage=new Cage[jumlahCage];
    counterCage=0;
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
    jumlahCage=2;
    listCage=new Cage[jumlahCage];
    counterCage=0;
  }
  /** @brief 
   * 
   */
  public void setCage(Cage inputCage){
    listCage[counterCage]=inputCage;
    listCage[counterCage].setCageNumber(counterCage);
    counterCage=counterCage+1;
  }
  public Cage[] getListCage(){
    return(listCage);
  }
  public double getMakananTotal(){
    int i;
    double totalMakan;
    totalMakan=0;
    for(i=0;i<counterCage;i++){
      totalMakan=totalMakan+listCage[counterCage].getJumlahMakan();
    }
    return(totalMakan);
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
  public void gambar(){
    int i,j;
    for(i=0;i<sizeX;i++){
      for(j=0;j<sizeY;j++){
        System.out.print(getPoint(i,j).render());
      }
      System.out.println();
    }
  }
}
