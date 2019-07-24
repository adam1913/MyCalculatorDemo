package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator(10.0);
        double actual = calculator.add(5);
        double expected = 15;
    }
    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator(10);
        double actual = calculator.subtract(5);
        double expected = 5;
    }
    @Test (expected = ArithmeticException.class)
    public void divideByZero(){
         Calculator calculator = new Calculator(10);
        double actual = calculator.divide(0);
    }
    @Test
    public void multiplyTest(){
        Calculator calc = new Calculator(10);
        double actual = calc.multiply(5);
        double expected = 50;
    }
    @Test
    public void divideTest(){
        Calculator calc = new Calculator(10);
        double actual = calc.multiply(1);
        double expected = 10;
    }
    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest(){
        Calculator calc = new Calculator(10);
        calc.divide(0);
    }
    @Test
    public void squareTest(){
        Calculator calc = new Calculator(5);
        double actual = calc.square();
        double expected = 25;
    }
    @Test
    public void squareRootTest(){
        Calculator calc = new Calculator(25);
        double actual = calc.squareRoot();
        double expected = 5;
    }
    @Test
    public void exponentiationTest(){
        Calculator calc = new Calculator(5);
        double actual = calc.exponentiation(2);
        double expected = 25;
    }
    @Test
    public void inverseTest(){
        Calculator calc = new Calculator(5);
        double actual = calc.inverse();
        double expected = 0.2;
    }
    @Test
    public void invertTest(){
        double input = 5;
        Calculator calc = new Calculator(input);
        double actual = calc.invert();
        double expected = 0-input;
    }
}
