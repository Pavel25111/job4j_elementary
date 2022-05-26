package ru.job4j.converter;

public class Fit {
    public static double manWeight(short manHeight) {
        double weight = (manHeight - 100) * 1.15;
        return weight;
    }

    public static double womamWeight(short womenHeight) {
        double weight = (womenHeight - 110) * 1.15;
        return weight;
    }

    public static void main(String[] arg) {
        short manHeight = 180;
        short womanHeight = 150;
        double manWeight = Fit.manWeight(manHeight);
        double womanWeight = Fit.womamWeight(womanHeight);
        System.out.println("Man " + manHeight + " is " + manWeight);
        System.out.println("Woman " + womanHeight + " is " + womanWeight);
    }
}

