package animal.airanimal.accipitridae;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.airanimal.accipitridae.Eagle .java
 * Tanggal      : 27-Mar-17
 */
class EagleTest {
    @Test
    void getFoodNum() {
        Eagle E = new Eagle();
        int I = 12;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        Eagle E = new Eagle();
        char C = 'E';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        Eagle E = new Eagle();
        String S = "Aquila chrysaetos";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        Eagle E = new Eagle();
        String S = "Accipitridae";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Eagle E = new Eagle();
        String S = "screeech!";
        assertTrue(E.GetIsiExperience()== S);
    }

}