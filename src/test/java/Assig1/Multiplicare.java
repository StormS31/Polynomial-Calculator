package Assig1;

import Assig1.Model.Model;

import static org.junit.jupiter.api.Assertions.*;

class Multiplicare {

    @org.junit.jupiter.api.Test
    void multiplicaPolinoame() {
        Model model = new Model();
        String a = "2X+1";
        String b = "2X-1";
        String c = model.multiplicaPolinoame(a, b);
        assertTrue(c.equals("4.0x^2.0 -1.0 "));
    }

}