/**
 * 
 */
package cage;
import pointer.Pointer;
import animal.Animal;
import habitat.Habitat;
import java.util.Random;
/**
 * @author Finiko
 *
 */
public class Cage {
  /**
   * habitatType adalah type dari habitat. 0:land, 1:water, 2:air
   */
  private int habitatType;
  /**
   * luasCage adalah luas total dari Cage
   */
  private int luasCage;
  /**
   * cageNumber adalah nomor urut dari cage
   */
  private int cageNumber;
  /**
   * jumlahMakanan adalah jumlah total makanan yang dibutuhkan di Cage
   */
  private double jumlahMakanan;
  /**
   * counterAnimal adalah counter untuk penigisan animalData saat ini di Cage
   */
  private int counterAnimal;
  /**
   * animalData adalah array data dari animal
   */
  private Animal animalData[];
  /**
   * animalLocation adalah array lokasi dari animal
   */
  private Pointer animalLocation[];
  /**
   * counterPoint adalah counter untuk pengisian listPoint
   */
  private int counterPoint;
  /**
   * listPoint adalah array dari Point untuk suatu cage
   */
  private Pointer listPoint[];
  /**
   * Constructor
   * @param inputHabitat
   * @param inputMaxLuas
   * I.S : Cage belum terdefinisi
   * F.S : Cage terdefinisi
   */
  public Cage(int inputHabitat, int inputMaxLuas){
    listPoint=new Pointer[inputMaxLuas];
    counterPoint=0;
    animalData=new Animal[inputMaxLuas*30/100];
    animalLocation=new Pointer[inputMaxLuas*30/100];
    counterAnimal=0;
    luasCage=0;
    habitatType=inputHabitat;
    jumlahMakanan=0;
  }
  /**
   * pengecekan syarat apakah bisa memasukkan hewan ke Cage
   * @param inputAnimal
   * @param x
   * @param y
   * @return
   * I.S : x, y dan inputAnimal terdefinisi
   * F.S : true jika bisa memasukkan hewan. False jika tidak bisa.
   */
  public boolean bisaAddHewan(Animal inputAnimal,int x, int y){
    boolean temp;
    int i,j;
    char test;
    temp=false;
    if(counterAnimal<(luasCage*30)/100){
      if((inputAnimal.GetType())[habitatType] == 1){
        temp = true;
      }
    }
    if(temp){
      for(j=0;j<counterAnimal;j++){
        i=0;
        test=animalData[j].GetRender();
        while((temp)&&(i<inputAnimal.GetTopEnemy())){
          if ((inputAnimal.GetEnemy())[i] == test){
            temp = false;
          }
        }
      }
    }
    return temp;
  }
  /**
   * Menambahkan Hewan
   * @param inputAnimal
   * @param x
   * @param y
   * I.S : inputAnimal, x dan y terdefinisi
   * F.S : inputAnimal ditambahkan ke dalam Cage jika bisa. jika tidak, maka ditampilkan pesan kesalahan.
   */
  public void addHewan(Animal inputAnimal, int x, int y){
    if(bisaAddHewan(inputAnimal,x,y)){
      animalData[counterAnimal]=inputAnimal;
      animalLocation[counterAnimal].setPositionX(x);
      animalLocation[counterAnimal].setPositionY(y);
      counterAnimal=counterAnimal+1;
      jumlahMakanan=jumlahMakanan+inputAnimal.GetFoodNum();
      System.out.println("Berhasil ditambahkan");
    }else{
      System.out.println("Tidak bisa ditambahkan");
    }
  }
  /**
   * 
   * @param x
   * @param y
   * @return
   */
  public boolean isInCage(int x, int y){
    boolean diDalam;
    int i;
    i=0;
    diDalam=false;
    while((!diDalam)&&(i<counterPoint)){
      if((listPoint[i].getPositionX()==x)&&(listPoint[i].getPositionY()==y)){
        diDalam=true;
      }
    }
    return diDalam;
  }
  public boolean adaHewan(int x,int y){
    boolean temp;
    int i;
    i=0;
    temp=isInCage(x,y);
    while((temp)&&(i<counterAnimal)){
      if((animalLocation[i].getPositionX()==x)&&(animalLocation[i].getPositionY()==y)){
        temp=false;  
      }
    }
    return(temp);
  }
  public void setCageNumber(int inputNumber){
    cageNumber=inputNumber;
  }
  public void addHabitat(Habitat inputHabitat){
    inputHabitat.setCageNumber(cageNumber);
    luasCage=luasCage+1;
    listPoint[counterPoint].setPositionX(inputHabitat.getPositionX());
    listPoint[counterPoint].setPositionY(inputHabitat.getPositionY());
    counterPoint=counterPoint+1;
  }
  public void experienceHewan(){
    int i;
    for(i=0;i<counterAnimal;i++){
      animalData[i].GetExperience();
    }
  }
  public void render(char c[][]){
    int i;
    for(i=0;i<counterAnimal;i++){
  	  c[animalLocation[i].getPositionX()][animalLocation[i].getPositionY()]=animalData[i].GetRender();
    }
  }
  public void move(){
    int moveCommand,i;
    Random randomMove=new Random(3);
    for(i=0;i<counterAnimal;i++){
      moveCommand=randomMove.nextInt(3);
      if(moveCommand==0){
        if(!(adaHewan(animalLocation[i].getPositionX()-1,animalLocation[i].getPositionY()))){
          animalLocation[i].setPositionX(animalLocation[i].getPositionX()-1);
        }
      }else if(moveCommand==1){
        if(!(adaHewan(animalLocation[i].getPositionX()+1,animalLocation[i].getPositionY()))){
          animalLocation[i].setPositionX(animalLocation[i].getPositionX()+1);
        }
      }else if(moveCommand==2){
        if(!(adaHewan(animalLocation[i].getPositionX(),animalLocation[i].getPositionY()+1))){
          animalLocation[i].setPositionY(animalLocation[i].getPositionY()+1);
        }
      }else if(moveCommand==3){
        if(!(adaHewan(animalLocation[i].getPositionX(),animalLocation[i].getPositionY()-1))){
          animalLocation[i].setPositionY(animalLocation[i].getPositionY()-1);
        }
      }
    }
  }
  public double getJumlahMakan(){
	return(jumlahMakanan);  
  }
  public int getNumberCage(){
    return(cageNumber);
  }
}
