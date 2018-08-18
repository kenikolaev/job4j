package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean firstElement = data[0];
        for (int index = 1; index < data.length; index++) {
            if(firstElement != data[index]) {
                return false;
            }
        }
        return result;
    }
}