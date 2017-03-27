package animal;

/**
 * Created by asus on 25-Mar-17.
 */
public class Animal {
    /** Type habitat hewan. 0 : darat, 1 : udara, 2 : air
     */
    protected int[] type;
    /** Family hewan
     */
    protected String famili;
    /** Species hewan
     */
    protected String species;
    /** Experience hewan
     */
    protected String experience;
    /** Jenis Makanan hewan. 1 : herbifor, 2 : karnivor, 3 : omnifor
     */
    protected short jenis_makanan;
    /**  Berat hewan
     */
    protected int berat;
    /** Char yang digunakan untuk render
     */
    protected char animal_char;
    /** Array of char yang berisi list musuhnya
     */
    protected char[] enemy_char;
    /** Pointer EnemyChar yang available
     */
    int top_enemy;

    public Animal() {
        int i;
        type = new int[3];
        for(i=0;i<3;i++){
            type[i]=0;
        }
        enemy_char = new char[10];
        top_enemy = 0;
    }
    /** Komunikasi dengan hewan
     */
    public void GetExperience() {
        System.out.println( "Hewan ini tinggal di : ");
        if (type[0]==1) System.out.println("darat ");
        if (type[1]==1) System.out.println("udara ");
        if (type[2]==1) System.out.println("air ");
        System.out.print("Hewan ini tergabung di famili ");
        System.out.print(famili);
        System.out.print(" dan dengan nama spesies ");
        System.out.println(species);
        System.out.println(experience);
    }

    public double GetFoodNum(){
        double jumlah_makanan;
        if(jenis_makanan==1){
            jumlah_makanan=berat*0.5;
        }
        else{
            if(jenis_makanan==2){
                jumlah_makanan=berat*0.2;
            }
            else{
                jumlah_makanan=berat*0.3;
            }
        }
        return jumlah_makanan;
    }

    /**  Print karakter simbol pada peta
     * @return char
     */
    public char GetRender() {

        return (animal_char);
    }
    /** Set karakter hewan
     * @param cc Karakter hewan tsb
     */
    public void SetEnemy(char cc) {
        enemy_char[top_enemy] = cc;
        top_enemy++;
    }
    /** Ambil list musuh
     * @return List Musuh
     */
    public char[] GetEnemy() {
        return enemy_char;
    }
    /** dapat jumlah musuh
     * @return jumlah musuh
     */
    public int GetTopEnemy() {
        return top_enemy;
    }

    /** Ambil tipe habitat hewan
     * @return List habitat
     */
    public int[] GetType() {
        return (type);
    }
    /** Ambil species hewan
     * @return string species
     */
    public String GetSpecies() {
        return species;
    }
    /** Ambil famili hewan
     * @return string famili
     */
    public String GetFamili() {
        return famili;
    }
    /** Ambil experience hewan
     * @return string experience
     */
    public String GetIsiExperience() {
        return experience;
    }
}
