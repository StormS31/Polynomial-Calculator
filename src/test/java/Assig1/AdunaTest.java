package Assig1;

import Assig1.Model.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdunaTest {

    @Test
    void addPolinoame() {
        Model model = new Model();
        String a = "2X+1";
        String b = "2X-1";
        String c = model.addPolinoame(a, b);
        assertTrue(c.equals("4.0x"));
    }
}