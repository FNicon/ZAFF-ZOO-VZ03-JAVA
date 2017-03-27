package animal.landanimal.ursoidea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.landanimal.ursoidea.Panda .java
 * Tanggal      : 28-Mar-17
 */
class PandaTest {
    @Test
    void getFoodNum() {
        Panda E = new Panda();
        int I = 450;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        Panda E = new Panda();
        char C = 'P';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        Panda E = new Panda();
        String S = "Ailuropoda melanoleuca";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        Panda E = new Panda();
        String S = "Ursoidea";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Panda E = new Panda();
        String S = "The panda is eating bamboos";
        assertTrue(E.GetIsiExperience()== S);
    }

}