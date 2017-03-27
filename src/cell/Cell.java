/**
 * 
 */
package cell;

/**
 * @author Finiko
 *
 */
import pointer.Pointer;

public abstract class Cell {
  /** type cell
   */
  //protected T t;
  /** ukuran x cell
    */
  private int size_x;
  /** ukuran y cell
    */
  private int size_y;
  private Pointer val[][];

		  /** type cell
		    */
  //protected Point*** pos;
		  /** Pos yang kosong
		    */
 // protected int EmptyPos;
		  /** Exit
		    */
  //protected Exit* Keluar;
		  /** ada Exit
		    */
  //protected boolean adaExit;
		  /** Masuk
		    */
  //protected Entrance* Masuk;
		  /** Ada Masuk
		    */
  //protected boolean adaEntry;

		    // array of Cage
		  /** Array Kandang
		    */
  //protected Cage** C;
  //protected int TopCage;
		  /** Ukuran Kandang
		    */
 // protected int SizeCage;

  /** @brief constructor
   *  @I.S Cell tidak terdefinisi
   *  @F.S Cell terdefinisi dengan ukuran default
   */
  Cell(){
	int i;

    Pointer val[][] =new Pointer [20][];
    for (i=0;i<20;i++){
      val[i]=new Pointer[20];
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
  Cell(int x, int y, int jumlah_kandang){
	  size_x=x;
	  size_y=y;
	  int i;
	  
  Pointer val[][]=new Pointer[size_x][];
	  for(i=0;i<size_x;i++){
		  val[i]=new Pointer[size_y];
	}
  }
  /** @brief 
   * 
   */
  void SetCage(){
	  
  }
  int GetSizeX(){
	  return(size_x);
  }
  int GetSizeY(){
	  return(size_y);
  }
  Pointer getval(int x, int y){
	return(val[x][y]);  
  }
  void setval(int x, int y, Pointer v){
	val[x][y]=v;
  }
}
