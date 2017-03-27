package animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Nama         : Zacki Zulfikar Fauzi
 * NIM          : 13515147
 * Nama File    : animal.Animal .java
 * Tanggal      : 28-Mar-17
 */
class AnimalTest {
    @Test
    void getType() {
        Animal A = new Animal();
        assertTrue((A.GetType()[0]== 0)&&(A.GetType()[1]== 0)&&(A.GetType()[2]== 0));
    }

}