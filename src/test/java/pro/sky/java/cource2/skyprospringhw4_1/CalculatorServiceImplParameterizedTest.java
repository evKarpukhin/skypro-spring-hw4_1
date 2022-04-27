package pro.sky.java.cource2.skyprospringhw4_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParameterizedTest {

    private static final CalculatorService out = new CalculatorServiceImpl();

    private static final int a1 = 6;
    private static final int b1 = 2;
    private static final int a2 = 8;
    private static final int b2 = 1;
    private static final int a3 = 100;
    private static final int b3 = 0;


    public static Stream<Arguments> provideParametersForTestsPlus() {
        return Stream.of(
                Arguments.of(8, a1, b1),
                Arguments.of(9, a2, b2)
                );
    }

    public static Stream<Arguments> provideParametersForTestsMinus() {
        return Stream.of(
                Arguments.of(4, a1, b1),
                Arguments.of(7, a2, b2)
                );
    }

    public static Stream<Arguments> provideParametersForTestsMiltiply() {
        return Stream.of(
                Arguments.of(12 , a1, b1),
                Arguments.of(8 , a2, b2 )
        );
    }

    public static Stream<Arguments> provideParametersForTestsDevide() {
        return Stream.of(
                Arguments.of(3 , a1, b1),
                Arguments.of(8 , a2, b2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParametersForTestsPlus")
    public void checkMethodsPlus(int a, int b, int c) {
        assertEquals(a, out.plus(b, c));
    }

    @ParameterizedTest
    @MethodSource("provideParametersForTestsMinus")
    public void checkMethodsMinus(int a, int b, int c) {
        assertEquals(a, out.minus(b, c));
    }

    @ParameterizedTest
    @MethodSource("provideParametersForTestsMiltiply")
    public void checkMethodsMiltiply(int a, int b, int c) {
        assertEquals(a, out.multiply(b, c));
    }

    @ParameterizedTest
    @MethodSource("provideParametersForTestsDevide")
    public void checkMethodsDevide(int a, int b, int c) {
        assertEquals(a, out.divide(b, c));
    }

    @Test
    public void exceptAlert() {
        assertThrows(MyIllegalArgumentException.class, () -> out.divide(a3, b3));
    }


}