package animal.wateranimal.cetacea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.wateranimal.cetacea.Dolphin .java
 * Tanggal      : 28-Mar-17
 */
class DolphinTest {
    @Test
    void getFoodNum() {
        Dolphin E = new Dolphin();
        int I = 4000;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        Dolphin E = new Dolphin();
        char C = 'D';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        Dolphin E = new Dolphin();
        String S = "Delphinus capensis";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        Dolphin E = new Dolphin();
        String S = "Cetacea";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Dolphin E = new Dolphin();
        String S = "click click";
        assertTrue(E.GetIsiExperience()== S);
    }

}