package pro.sky.java.cource2.skyprospringhw4_1;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private boolean isNotValue(String a, String b) {
        return (a.isEmpty() || b.isEmpty());
    }

    @Override
    public String plus(String a, String b) {
        if (isNotValue(a, b)) {
            return " Недостаточно параметров для вычисления ! ";
        }
        Integer i1 = Integer.valueOf(a);
        Integer i2 = Integer.valueOf(b);
        return "" + (i1 + i2);
    }

    @Override
    public String minus(String a, String b) {
        if (isNotValue(a, b)) {
            return " Недостаточно параметров для вычисления ! ";
        }
        Integer i1 = Integer.valueOf(a);
        Integer i2 = Integer.valueOf(b);
        return "" + (i1 - i2);
    }

    @Override
    public String multiply(String a, String b) {
        if (isNotValue(a, b)) {
            return " Недостаточно параметров для вычисления ! ";
        }
        Integer i1 = Integer.valueOf(a);
        Integer i2 = Integer.valueOf(b);
        return "" + (i1 * i2);
    }

    @Override
    public String divide(String a, String b) {
//        int d = 0;
//        String s;
//        String result;
/*
        if (isNotValue(a, b)) {
            return " Недостаточно параметров для вычисления ! ";
        }
*/

        int i1 = Integer.valueOf(a);
        int i2 = Integer.valueOf(b);

        if (i2 == 0) {
            throw new MyIllegalArgumentException("Деление на ноль!!!");
        }

        return "" + i1 / i2;

/*
        try {
            d = i1 / i2;
        } catch (ArithmeticException e) {
            s = "Деление на ноль !";
            result = "" + s;
            return result;
        } finally {
            result = "" + d;
        }
        return result;
*/
    }
}
