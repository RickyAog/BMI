package com.LickingHeghts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        double  Feet,Inches,Weight;
        String usersName,Greetings;


        System.out.println("Hello");
        Greetings = keyboard.nextLine();
        System.out.println("Oh thank you for stopping by to calculate your BMI now how tall are yo- wait what is your name");
        usersName = keyboard.nextLine();
        System.out.println("Well "+ usersName + " I am gonna ask you a few questions First question,");
        System.out.println("how tall are you in feet");
        Feet = Float.valueOf(keyboard.nextLine());
        System.out.println("Second question, how tall are you in inches");
        Inches = Float.valueOf(keyboard.nextLine());
        System.out.println("Final question,how much do you weigh");
        Weight = Float.valueOf(keyboard.nextLine());
        Weight = Weight/2.205;
        Feet = Feet/3.281;
        Inches = Inches/39.37;
        System.out.println("Well " + usersName + " your BMI is " + (Weight / Feet*Inches));
        System.out.println("Thank for stopping by and ask your friends if they want to calculate their BMI");





    }
}
