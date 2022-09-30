package com.syntexpro.test;

import com.syntexpro.dev.Calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CalculatorTestJunit {

//    if you write static, no need write Assertion
//    no need make this line =Calculator calculator1 = new Calculator();= if make this line
//    (Calculator calculator) before @BeforeEach like below.

    private Calculator calculator;

    @BeforeEach
    public void objectSetup() {
        calculator = new Calculator();

    }

    @Test
    @Order(1)
    @DisplayName("It is a addition test")
    public void calculatoradditionTest() {
//        Calculator calculator1 = new Calculator();
        assertEquals(42, calculator.addition(19, 23));

    }

    @Test
    @Order(2)
    @DisplayName("This is a subtraction test")
    public void calculatorsubtractionTest() {
//        Calculator calculator2 = new Calculator();
        assertEquals(22, calculator.subtraction(45, 23));

    }

    @Test
    @Order(3)
    @DisplayName("This is also multiplication test")
    public void calculatormultiplicationTest() {
//        Calculator calculator3 = new Calculator();
        assertEquals(60, calculator.multiplication(5, 12));

    }

    @Test
    @Order(4)
    @DisplayName("It is division test")
    public void calculatordivisionTest() {
//        Calculator calculator4 = new Calculator();
        assertEquals(17, calculator.division(34, 2));

    }


}
