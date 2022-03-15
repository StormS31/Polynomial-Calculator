package Assig1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScadeTest {

    @Test
    void subPolinoame() {
        Model model = new Model();
        String a = "3X+1";
        String b = "2X+1";
        String c = model.subPolinoame(a, b);
        assertTrue(c.equals("1.0x^1.0 "));
    }
}