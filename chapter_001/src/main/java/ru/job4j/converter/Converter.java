package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value рубли.
     * @return Евро.
     */
    public int euroToRouble(int value) {
        return value * 70;
    }

    /**
     * Конвертируем доллары в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int dollarToRouble(int value) {
        return value * 60;
    }
}