package hbcu.stay.ready.ttime;

import java.util.*;

public class ScientificCalculator extends Calculator {
    public double memory;




    public double sine(double memory) {
        memory = Math.sin(memory);
        return memory;
    }

    public double cosine(double memory) {

        memory = Math.cos(memory);
        return memory;
    }

    public double tangent(double memory) {

        memory = Math.tan(memory);
        return memory;
    }

    public double inverseSine(double memory) {
        memory = Math.asin(memory);
        return memory;
    }

    public double inverseCosine(double memory) {
        memory = Math.acos(memory);
        return memory;
    }

    public double inverseTangent(double memory) {
        memory = Math.atan(memory);
        return memory;
    }

    public double factorial(double memory) {
        int current = (int) Math.round(memory);

        for (int i = current - 1; i > 0; i--) {
            current *= i;
        }
        return current;
    }

    public double addToMemory(double memory) {
        memory += memory;
        return memory;
    }

    public double resetMemory(double memory) {
        memory = 0;
        return memory;
    }

    public double log(double memory) {

        memory = Math.log10(memory);
        return memory;
    }

    public double inverseLog(double memory) {
        memory = Math.exp(memory);
        return memory;
    }

    public double naturalLog(double memory) {
        memory = Math.log(memory);
        return memory;
    }
}
