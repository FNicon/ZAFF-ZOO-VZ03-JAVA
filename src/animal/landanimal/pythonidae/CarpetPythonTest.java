package animal.landanimal.pythonidae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.pythonidae.CarpetPython .java
 * Tanggal      : 28-Mar-17
 */
class CarpetPythonTest {
    @Test
    void getFoodNum() {
        CarpetPython E = new CarpetPython();
        int I = 24;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        CarpetPython E = new CarpetPython();
        char C = 'Q';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        CarpetPython E = new CarpetPython();
        String S = "Morelia spilota";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        CarpetPython E = new CarpetPython();
        String S = "Pythonidae";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        CarpetPython E = new CarpetPython();
        String S = "SSSSSSSSSSSSSSSSSSSSSSSSS";
        assertTrue(E.GetIsiExperience()== S);
    }

}