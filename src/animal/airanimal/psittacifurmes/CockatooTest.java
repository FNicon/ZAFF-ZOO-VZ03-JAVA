package animal.airanimal.psittacifurmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.airanimal.psittacifurmes.Cockatoo .java
 * Tanggal      : 27-Mar-17
 */
class CockatooTest {
    @Test
    void getFoodNum() {
        Cockatoo E = new Cockatoo();
        int I = 20;
        assertTrue(E.GetFoodNum()== I);
    }

    @Test
    void getRender() {
        Cockatoo E = new Cockatoo();
        char C = 't';
        assertTrue(E.GetRender()== C);
    }

    @Test
    void getSpecies() {
        Cockatoo E = new Cockatoo();
        String S = "Calyptorhynchus lathami";
        assertTrue(E.GetSpecies()== S);
    }

    @Test
    void getFamili() {
        Cockatoo E = new Cockatoo();
        String S = "Psittacifurmes";
        assertTrue(E.GetFamili()== S);
    }

    @Test
    void getIsiExperience() {
        Cockatoo E = new Cockatoo();
        String S = "It can talk??";
        assertTrue(E.GetIsiExperience()== S);
    }

}