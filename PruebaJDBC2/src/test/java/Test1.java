import TestPRueba.Suma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test1 {

    @Test
    void testSuma() {
        Suma s = new Suma();
        assertEquals(4, s.suma(1, 3));
        assertNotEquals(5, s.suma(2, 2));
    }

}
