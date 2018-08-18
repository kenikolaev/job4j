package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int lastIndex = data[0].length - 1;
        boolean firstElement = data[0][0];
        boolean lastElementInFirstRow = data[0][lastIndex];
        for(int index = 1; index < data[0].length; index++) {
            if((data[index][index] != firstElement) || (data[index][lastIndex - index] != lastElementInFirstRow)) {
                result = false;
                break;
            }
        }
        return result;
    }
}