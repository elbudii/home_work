package com.kblyumkin.lecture1.homeWork;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        double length = 0;
        double square = 0;
        double a = 0;
        double b = 0;
        double c = 0;



        a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

        length = a + b + c;

        square = (length*(length - a)*(length - b)*(length - c)) * (length*(length - a)*(length - b)*(length - c));


        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
