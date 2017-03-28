/**
 * 
 */
package cage;

/**
 * @author Finiko
 *
 */
public class Cage {
  private int cageNumber;
  private int jumlahHewan;
  private int jumlahMakanan;
  private int habitatType;
  private int luasCage;
  
  public Cage(){
    luasCage=1;
    cageNumber=0;
    jumlahHewan=0;
    jumlahMakanan=0;
  }
  public void addHewan(){
    if (jumlahHewan<=0.3*luasCage){
      jumlahHewan=jumlahHewan+1;
      //jumlahMakanan=jumlahMakanan+(makananhewan)
      //new Hewan;
    }
    else{
      System.out.println("Kandang Penuh");
    }
  }
  public int getJumlahMakan(){
	return(jumlahMakanan);  
  }
  public int getNumberCage(){
    return(cageNumber);
  }
  
}
