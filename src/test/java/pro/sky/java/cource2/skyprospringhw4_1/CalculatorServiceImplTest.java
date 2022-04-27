package pro.sky.java.cource2.skyprospringhw4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    private final int a1 = 6;
    private final int b1 = 2;
    private final int a2 = 8;
    private final int b2 = 1;
    private final int a3 = 100;
    private final int b3 = 0;

    @Test
    void plus() {
        assertEquals(8 , out.plus(a1, b1));
        assertEquals(9 , out.plus(a2, b2));
    }

    @Test
    void minus() {
        assertEquals(4 , out.minus(a1, b1));
        assertEquals(7 , out.minus(a2, b2));
    }

    @Test
    void multiply() {
        assertEquals(12 , out.multiply(a1, b1));
        assertEquals(8 , out.multiply(a2, b2));
    }

    @Test
    void divide() {
        assertEquals(3 , out.divide(a1, b1));
        assertEquals(8 , out.divide(a2, b2));

        assertThrows(MyIllegalArgumentException.class , () -> out.divide(a3,b3));
    }
}