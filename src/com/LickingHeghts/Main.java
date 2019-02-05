package com.LickingHeghts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        Float Feet,Inches,Weight;
        String usersName,Greetings;


        System.out.println("Hello");
        Greetings = keyboard.nextLine();
        System.out.println("Oh think you for stopping by to calculate your BMI now how tall are yo- wait what is your name");
        usersName = keyboard.nextLine();
        System.out.println("Well "+ usersName + " I am gonna ask you a few questions First question,");
        System.out.println("how tall are you in feet converted to meters if you don't then you can ask google to convert it for you");
        Feet = Float.valueOf(keyboard.nextLine());
        System.out.println("Second question, how tall are you in inches converted to meters");
        System.out.println("Again if you don't know you can ask google to convert it for you");
        Inches = Float.valueOf(keyboard.nextLine());
        System.out.println("Final question,how much do you weigh converted to kilograms");
        System.out.println("If you need help ask google to convert it");
        Weight = Float.valueOf(keyboard.nextLine());

        System.out.println("Well " + usersName + "your BMI is " + (Weight / Feet *Inches));
        System.out.println("Thank for stopping by and ask your friends if they want to calculate their BMI");
    }
}
