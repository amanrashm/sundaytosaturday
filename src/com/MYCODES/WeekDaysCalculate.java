package com.MYCODES;

import java.util.Scanner;

public class WeekDaysCalculate {

    public static void main (String[]args){
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your case number");
        int weekdays = scan.nextInt();
        /* System.out.println(input); */

        switch (weekdays) {
            case 1:
                System.out.println("today is monday");
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            case 4:
                System.out.println("today is thursday");
                break;
            case 5:
                System.out.println("today is friday");
                break;
            default:
                System.out.println("today is sunday");
        }
    }
}
