package ru.job4j.loop;

public class Counter {

    public int add(int start, int finish) {
        int result = 0;
        for(int i = start; i <= finish; i++) {
            result += i % 2 == 0 ? i : 0;
        }
        return result;
    }
}
