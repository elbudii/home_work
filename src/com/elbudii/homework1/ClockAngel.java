package com.kblyumkin.lecture1.homeWork;

public class ClockAngel {
    public static void main(String[] args) {
        int hours = 27;
        int mins = 430;
        int result = 0;


        hours = hours % 24;
        mins = 430 % 60;
        hours = 360/12* hours;
        mins = 360/60* mins;
        result = Math.abs(hours - mins);


        System.out.println("Anglel between hours and minute narrows is " + result);
    }
}
