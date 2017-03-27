package animal.landanimal.cervidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.cervidae.Reindeer .java
 * Tanggal      : 28-Mar-17
 */
class ReindeerTest {
    @Test
    void getFoodNum() {
        Reindeer E = new Reindeer();
        int I = 850;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        Reindeer E = new Reindeer();
        char C = 'A';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        Reindeer E = new Reindeer();
        String S = "Rangifer tarandus";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        Reindeer E = new Reindeer();
        String S = "Cervidae";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Reindeer E = new Reindeer();
        String S = "It's a Reindeer";
        assertTrue(E.GetIsiExperience()== S);
    }

}