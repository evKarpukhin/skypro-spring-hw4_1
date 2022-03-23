package pro.sky.java.cource2.skyprospringhw4_1;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements CalculatorService{

    private boolean isNotValue(String a, String b){
        return ( a.equals("") || b.equals(""));
    }

    @Override
    public String toCalc() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String plus(String a, String b) {
        if ( isNotValue(a, b) ) {
            return " Недостаточно параметров для вычисления ! ";
        }
        Integer i1 = Integer.valueOf(a);
        Integer i2 = Integer.valueOf(b);
        return i1 + " + " + i2 + " = " + (i1 + i2);
    }

    @Override
    public String minus(String a, String b) {
        if ( isNotValue(a, b) ) {
            return " Недостаточно параметров для вычисления ! ";
        }
        Integer i1 = Integer.valueOf(a);
        Integer i2 = Integer.valueOf(b);
        return i1 + " - " + i2 + " = " + (i1 - i2);
    }

    @Override
    public String multiply(String a, String b) {
        if ( isNotValue(a, b) ) {
            return " Недостаточно параметров для вычисления ! ";
        }
        Integer i1 = Integer.valueOf(a);
        Integer i2 = Integer.valueOf(b);
        return i1 + " * " + i2 + " = " + (i1 * i2);
    }

    @Override
    public String divide(String a, String b) {
        int d = 0;
        String s;
        String result;

        if ( isNotValue(a, b) ) {
            return " Недостаточно параметров для вычисления ! ";
        }
        Integer i1 = Integer.valueOf(a);
        Integer i2 = Integer.valueOf(b);

        try {
            d = i1 / i2;
        } catch (ArithmeticException e) {
            s = "Деление на ноль !";
            return i1 + " / " + i2 + " = " + s;
        } finally {
            result = i1 + " / " + i2 + " = " + d;
        }
        return result;
    }
}
