package animal.landanimal.felidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.felidae.Tiger .java
 * Tanggal      : 28-Mar-17
 */
class TigerTest {
    @Test
    void getFoodNum() {
        Tiger E = new Tiger();
        int I = 400;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        Tiger E = new Tiger();
        char C = 'T';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        Tiger E = new Tiger();
        String S = "Panthera tigris tigris";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        Tiger E = new Tiger();
        String S = "Felidae";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Tiger E = new Tiger();
        String S = "ROAR!";
        assertTrue(E.GetIsiExperience()== S);
    }

}