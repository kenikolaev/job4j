package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for(int number = 1; number <= bound; number++) {
            rst[number - 1] = number * number;
        }
        return rst;
    }
}