package Assig1;

import Assig1.Model.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegrareTest {

    @Test
    void integreazaPolinoame() {
        Model model = new Model();
        String a = "2X+1";
        String c = model.integreazaPolinoame(a);
        assertTrue(c.equals("1.0x^2.0 + 1.0x"));
    }
}