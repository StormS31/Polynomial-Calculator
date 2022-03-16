package Assig1;

import Assig1.Model.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DerivareTest {

    @Test
    void deriveazaPolinoame() {
        Model model = new Model();
        String a = "2X+1";
        String c = model.deriveazaPolinoame(a);
        assertTrue(c.equals("2.0"));
    }
}