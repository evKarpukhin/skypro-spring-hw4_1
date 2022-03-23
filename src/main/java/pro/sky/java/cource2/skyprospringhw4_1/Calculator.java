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
    public String privet(){
        return calculatorService.toCalc();
    }


    @GetMapping("/plus")
    public String summa(@RequestParam(value = "num1") String a, @RequestParam(value = "num2") String b){
        return calculatorService.plus(a, b);
    }

    @GetMapping("/minus")
    public String raznost(@RequestParam(value = "num1") String a, @RequestParam(value = "num2") String b){
        return calculatorService.minus(a, b);
    }

    @GetMapping("/multiply")
    public String umnozit(@RequestParam(value = "num1") String a, @RequestParam(value = "num2") String b){
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public String delit(@RequestParam(value = "num1") String a, @RequestParam(value = "num2") String b){
        return calculatorService.divide(a, b);
    }


}
