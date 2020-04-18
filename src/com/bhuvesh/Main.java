package com.bhuvesh;

public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if(centimeters < 0.0){
            System.out.println("Invalid Parameters");
        }
        calcFeetAndInchesToCentimeters(25,10);
        calcFeetAndInchesToCentimeters(158);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || inches < 0 || inches > 12){
            System.out.println("Invalid Parameters");
            return -1;
        }

        double centimeters = (feet*12) * 2.54;
        System.out.println(feet + "Feet, " + inches + "Inches = " + centimeters + "Cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + "feet" + remainingInches + " and inches.");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
