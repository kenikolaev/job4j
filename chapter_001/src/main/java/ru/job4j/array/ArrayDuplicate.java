package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {

    public String[] remove(String[] array){
        int dublicatesNumber = 0;
        for(int pass = 0; pass < array.length - dublicatesNumber - 1; pass++) {
            String elementForScheck = array[pass];
            for(int index = pass + 1; index < array.length - dublicatesNumber; index++) {
                if(elementForScheck.equals(array[index])) {
                    dublicatesNumber++;
                    for(int indexForMove = index; indexForMove < array.length - dublicatesNumber; indexForMove++) {
                        String temp = array[indexForMove];
                        array[indexForMove] = array[indexForMove + 1];
                        array[indexForMove + 1] = temp;
                    }

                }
            }
        }
        return Arrays.copyOf(array, array.length - dublicatesNumber);
    }

}
