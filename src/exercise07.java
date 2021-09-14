/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;
import java.util.Formatter;

public class exercise07 {
    public static void main(String[] args) {
        System.out.printf("What is the length of the room in feet? ");
        Scanner scanner = new Scanner(System.in);
        String length = scanner.nextLine();
        int newlength = Integer.parseInt(length);
        System.out.printf("What is the width of the room in feet? ");
        Scanner scanner1 = new Scanner(System.in);
        String width = scanner1.nextLine();
        int newwidth = Integer.parseInt(width);
        int sqft;
        sqft = newwidth * newlength;
        double sqm;
        sqm = sqft * 0.09290304;
        Formatter fmtsqm = new Formatter();
        fmtsqm.format("%.3f",sqm);
        System.out.println("You entered dimensions of " + newlength + " feet by " + newwidth + " feet.");
        System.out.printf("The area is\n" + sqft + " square feet\n" + fmtsqm + " square meters");
    }
}