package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int rubble = 140;
        float euro = Converter.rubleToEuro(rubble);
        System.out.println(rubble + " rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(rubble);
        System.out.println(rubble + " rubles are " + dollar + " dollars.");
    }
}