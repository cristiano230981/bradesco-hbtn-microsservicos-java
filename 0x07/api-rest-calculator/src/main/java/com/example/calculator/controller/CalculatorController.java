package com.example.calculator.controller;

import com.example.calculator.model.Calculator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    Calculator calc = new Calculator();

    @GetMapping("/welcome")
    public String messageWelcome() {
        return "Bem vindo à CALCULATOR API REST.";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam Double number1, @RequestParam Double number2) {
        return "Resultado: " + calc.sum(number1, number2);
    }

    @GetMapping("/subNumbers")
    public String subNumbers(@RequestParam Double number1, @RequestParam Double number2) {
        return "Resultado: " + calc.sub(number1, number2);
    }

    @GetMapping("/divideNumbers")
    public String divideNumbers(@RequestParam Double number1, @RequestParam Double number2) {
        return "Resultado: " + calc.divide(number1, number2);
    }

    @GetMapping("/factorial")
    public String factorial(@RequestParam Integer factorial) {
        return "Resultado: " + calc.factorial(factorial);
    }

    @GetMapping("/calculeDayBetweenDate")
    public String calculeDayBetweenDate(
            @RequestParam("localDate1") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate1,
            @RequestParam("localDate2") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate2) {
        return "Total de dias: " + calc.calculeDayBetweenDate(localDate1, localDate2);
    }

    @GetMapping("/integerToBinary")
    public String integerToBinary(@RequestParam Integer number1) {
        return "Binário: " + calc.integerToBinary(number1);
    }

    @GetMapping("/integerToHexadecimal")
    public String integerToHexadecimal(@RequestParam Integer number1) {
        return "Hexadecimal: " + calc.integerToHexadecimal(number1);
    }
}