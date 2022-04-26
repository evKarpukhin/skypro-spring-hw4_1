package pro.sky.java.cource2.skyprospringhw4_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParameterizedTest {

    private static final CalculatorService out = new CalculatorServiceImpl();

    private static final String a1 = "6";
    private static final String b1 = "2";
    private static final String a2 = "8";
    private static final String b2 = "1";
    private static final String a3 = "100";
    private static final String b3 = "0";


    public static Stream<Arguments> provideParametersForTests() {
        return Stream.of(
                Arguments.of("8" , out.plus(a1, b1)),
                Arguments.of("9" , out.plus(a2, b2)),
                Arguments.of("4" , out.minus(a1, b1)),
                Arguments.of("7" , out.minus(a2, b2)),
                Arguments.of("12" , out.multiply(a1, b1)),
                Arguments.of("8" , out.multiply(a2, b2)),
                Arguments.of("3" , out.divide(a1, b1)),
                Arguments.of("8" , out.divide(a2, b2))
        );
    }

    @Test
    public void exceptAlert(){
        assertThrows(MyIllegalArgumentException.class , () -> out.divide(a3,b3));
    }

    @ParameterizedTest
    @MethodSource("provideParametersForTests")
    public void chckMetods(String s1, String s2) {
        assertEquals(s1, s2);
    }

}