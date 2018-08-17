package ru.job4j.loop;

public class Factorial {

    public int factorial(int start, int finish) {
        int result = 1;
        if(start > 0) {
            for (int i = start; i <= finish; i++) {
                result *= i;
            }
        }
        return  result;
    }

}
