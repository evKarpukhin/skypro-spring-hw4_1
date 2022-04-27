package pro.sky.java.cource2.skyprospringhw4_1;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return (a - b);
    }

    @Override
    public int multiply(int a, int b) {
        return (a * b);
    }

    @Override
    public int divide(int a, int b) {

        if (b == 0) {
            throw new MyIllegalArgumentException("Деление на ноль!!!");
        }
        return  a / b;
    }
}
