package animal.landanimal.elephantidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.elephantidae.AfricanElephant .java
 * Tanggal      : 28-Mar-17
 */
class AfricanElephantTest {
    @Test
    void getFoodNum() {
        AfricanElephant E = new AfricanElephant();
        int I = 30000;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        AfricanElephant E = new AfricanElephant();
        char C = 'G';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        AfricanElephant E = new AfricanElephant();
        String S = "Loxodonta";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        AfricanElephant E = new AfricanElephant();
        String S = "Elephantidae";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        AfricanElephant E = new AfricanElephant();
        String S = "This elephant originated from africa";
        assertTrue(E.GetIsiExperience()== S);
    }

}