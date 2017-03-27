package animal.landanimal.pythonidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.pythonidae.IndianPython .java
 * Tanggal      : 28-Mar-17
 */
class IndianPythonTest {
    @Test
    void getFoodNum() {
        IndianPython E = new IndianPython();
        int I = 6;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        IndianPython E = new IndianPython();
        char C = 'F';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        IndianPython E = new IndianPython();
        String S = "Python molurus";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        IndianPython E = new IndianPython();
        String S = "Pythonidae";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        IndianPython E = new IndianPython();
        String S = "Hssssssh!";
        assertTrue(E.GetIsiExperience()== S);
    }

}