package com.elbudii.homework1;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = -4;

        double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

        double length = a + b + c;
        double square = Math.sqrt(length / 2 * (length / 2 - a) * (length / 2 - b) * (length / 2 - c));

        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
