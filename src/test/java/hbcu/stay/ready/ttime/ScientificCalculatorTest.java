package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;
import java.util.logging.Logger;




public class ScientificCalculatorTest extends ScientificCalculator {



    @Test
    public void sineTest(){
        ScientificCalculator scientificCalculator = new ScientificCalculator();


        double actual = scientificCalculator.sine(10) ;
       System.out.print(actual);
    }

    @Test
    public void cosineTest(){
        ScientificCalculator calculator = new ScientificCalculator();
        double actual = calculator.cosine(10);
        double expected = -0.8390715290764524;

       System.out.print(actual);

    }

    @Test
    public void tangentTest(){
        ScientificCalculator calculator = new ScientificCalculator();
        double actual = calculator.tangent(15);
        double expected =-0.8559934009085188;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseSineTest(){
        ScientificCalculator calculator = new ScientificCalculator();
        double actual = calculator.inverseSine(.010);
        double expected = 0.010000166674167114;

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void inverseCosineTest(){
        ScientificCalculator calculator = new ScientificCalculator();
        double actual = calculator.inverseCosine(.010);
        double expected = 1.5607961601207294;

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void inverseTangentTest(){
        ScientificCalculator calculator = new ScientificCalculator();
        double actual = calculator.inverseTangent(20);
        double expected = 1.5208379310729538;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void factorialTest(){
        ScientificCalculator calculator = new ScientificCalculator();
        double actual = calculator.factorial(10);
        double expected = 3628800.0;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void addMemoryTest(){
        ScientificCalculator calculator = new ScientificCalculator();
        double actual = calculator.addToMemory(1);
        double expected = 2;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void resetMemoryTest(){
        ScientificCalculator calculator = new ScientificCalculator();
        double actual = calculator.resetMemory(0);
        double expected = 0;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void logTest(){
        ScientificCalculator calculator = new ScientificCalculator();
        double actual = calculator.log(2000);
        double expected = 3.3010299956639813;

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void inverseLogTest(){
        ScientificCalculator calculator = new ScientificCalculator();
        double actual = calculator.inverseLog(20);
        double expected = 4.851651954097903E8;

        Assert.assertEquals(expected, actual, 0);

    }
}

