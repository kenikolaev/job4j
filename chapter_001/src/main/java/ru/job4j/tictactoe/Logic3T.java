package ru.job4j.tictactoe;

import java.util.function.Predicate;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        return isWinner(Figure3T::hasMarkX);
    }


    public boolean isWinnerO() {
        return isWinner(Figure3T::hasMarkO);
    }

    public boolean isWinner(Predicate<Figure3T> predicate) {
        boolean result = false;
        for(int index = 0; index < this.table.length; index++) {
            if(this.fillBy(predicate, 0, index, 1, 0) ||
                    this.fillBy(predicate, index, 0, 0, 1)) {
                result = true;
                break;
            }
        }
        return result || (this.fillBy(predicate, 0,0, 1, 1) ||
                this.fillBy(predicate, this.table.length - 1 , 0, -1, 1));
    }

    public boolean hasGap() {
        boolean result = false;
        for(int row = 0; row < 3; row++) {
            for(int column =0; column < 3; column++) {
                if(!table[row][column].hasMarkO() && !table[row][column].hasMarkX()) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
        for (int index = 0; index != this.table.length; index++) {
            Figure3T cell = this.table[startX][startY];
            startX += deltaX;
            startY += deltaY;
            if (!predicate.test(cell)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
