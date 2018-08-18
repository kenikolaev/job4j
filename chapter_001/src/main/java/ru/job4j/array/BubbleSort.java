package ru.job4j.array;

public class BubbleSort {

    public int[] sort(int[] array) {
        for(int pass = 1; pass < array.length; pass++) {
            for(int index = 0; index < array.length - pass; index++) {
                if(array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
    }

}
