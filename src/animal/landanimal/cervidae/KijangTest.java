package animal.landanimal.cervidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.cervidae.Kijang .java
 * Tanggal      : 28-Mar-17
 */
class KijangTest {
    @Test
    void getFoodNum() {
        Kijang E = new Kijang();
        int I = 850;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        Kijang E = new Kijang();
        char C = 'C';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        Kijang E = new Kijang();
        String S = "Muntiacus muntjak";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        Kijang E = new Kijang();
        String S = "Cervidae";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Kijang E = new Kijang();
        String S = "Siiii Kijang";
        assertTrue(E.GetIsiExperience()== S);
    }

}