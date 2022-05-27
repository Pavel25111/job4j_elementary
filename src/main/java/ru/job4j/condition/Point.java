package ru.job4j.condition;

public class Point {
        public static double distance(int x1, int y1, int x2, int y2) {
            double first = Math.pow(x2 - x1, 2);
            double second = Math.pow(y2 - y1, 2);
            double third = Math.sqrt(first + second);
            return third;
        }

        public static void main(String[] args) {
            double result = Point.distance(1, 1, 2, 2);
            System.out.println("result (1, 1) to (2, 2) " + result);
        }
}

