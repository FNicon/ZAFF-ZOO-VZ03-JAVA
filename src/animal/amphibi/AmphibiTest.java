package animal.amphibi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.amphibi.Amphibi .java
 * Tanggal      : 28-Mar-17
 */
class AmphibiTest {
    @Test
    void getType() {
        Amphibi A = new Amphibi();
        assertTrue((A.GetType()[0]== 1)&&(A.GetType()[2]== 1));
    }

}