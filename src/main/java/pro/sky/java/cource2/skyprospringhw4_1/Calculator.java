package pro.sky.java.cource2.skyprospringhw4_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Calculator {
    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String privet() {
        return "Добро пожаловать в калькулятор!";
    }


    @GetMapping("/plus")
    public String summa(@RequestParam(value = "num1") String a, @RequestParam(value = "num2") String b) {
        String result =  calculatorService.plus(a, b);
        return a + " + " + b + " = " + result;
    }

    @GetMapping("/minus")
    public String raznost(@RequestParam(value = "num1") String a, @RequestParam(value = "num2") String b) {
        String result = calculatorService.minus(a, b);
        return a + " - " + b + " = " + result;
    }

    @GetMapping("/multiply")
    public String umnozit(@RequestParam(value = "num1") String a, @RequestParam(value = "num2") String b) {
        String result = calculatorService.multiply(a, b);
        return a + " * " + b + " = " + result;
    }

    @GetMapping("/divide")
    public String delit(@RequestParam(value = "num1") String a, @RequestParam(value = "num2") String b) {
        String result = calculatorService.divide(a, b);
        return a + " / " + b + " = " + result;
    }


}
