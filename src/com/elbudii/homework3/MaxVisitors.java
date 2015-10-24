package com.elbudii.homework3;

public class MaxVisitors {
    public static void main(String[] args) {

        boolean[] visits = {true, true, true, false, true, false, false, true, true, true,
                false, false, false, true, false, false};
        int sumTrue = 0;
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < visits.length; i++) {
            sumTrue += visits[i] ? 1 : 0;
            count += visits[i] ? 1 : -1;
            if ( maxCount < count)
                maxCount = count;
        }
        if (sumTrue == (visits.length - sumTrue))
            System.out.println("Max visitor for day was " + maxCount);
         else {
            System.out.println("Not all visitors are gone");
        }
    }
}
