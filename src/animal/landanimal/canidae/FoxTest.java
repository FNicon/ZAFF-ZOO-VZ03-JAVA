package animal.landanimal.canidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.canidae.Fox .java
 * Tanggal      : 28-Mar-17
 */
class FoxTest {
    @Test
    void getFoodNum() {
        Fox E = new Fox();
        int I = 12;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        Fox E = new Fox();
        char C = 'Y';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        Fox E = new Fox();
        String S = "Vulpes lagopus";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        Fox E = new Fox();
        String S = "Canidae";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Fox E = new Fox();
        String S = "What does the fox says ?";
        assertTrue(E.GetIsiExperience()== S);
    }

}