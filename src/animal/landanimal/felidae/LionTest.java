package animal.landanimal.felidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.felidae.Lion .java
 * Tanggal      : 28-Mar-17
 */
class LionTest {
    @Test
    void getFoodNum() {
        Lion E = new Lion();
        int I = 360;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        Lion E = new Lion();
        char C = 'L';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        Lion E = new Lion();
        String S = "Panthera leo";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        Lion E = new Lion();
        String S = "Felidae";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Lion E = new Lion();
        String S = "ROAAARRR!";
        assertTrue(E.GetIsiExperience()== S);
    }

}