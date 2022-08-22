package Chapter4;
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        System.out.println("Enter your weight in kilograms: ");
        Scanner kilo = new Scanner(System.in);
        double userKilo = kilo.nextDouble();
        System.out.println("Enter your height in metres: ");
        Scanner height = new Scanner(System.in);
        double userHeight = height.nextDouble();
        double bmi = ( userKilo / Math.pow(userHeight,2));
        if (bmi < 15 ) {
            System.out.println("Your Body Mass Index: " + bmi + " and you are very seriously underweight ");
        } else if (bmi >15 && bmi < 16) {
            System.out.println("Your Body Mass Index: " + bmi + " and you are seriously underweight");
        } else if (bmi > 16 && bmi < 18.5 ) {
            System.out.println("Your Body Mass Index: " + bmi + " and you are underweight");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.println("Your Body Mass Index: " + bmi + " and you are normal weight");
        } else if (bmi >25 && bmi < 30) {
            System.out.println("Your Body Mass Index: " + bmi + " and you are overweight");
        } else if (bmi > 30 && bmi <35) {
            System.out.println("Your Body Mass Index: " + bmi + " and you are first degree obese");
        } else if (bmi > 35 && bmi < 40) {
            System.out.println("Your Body Mass Index: " + bmi + " and you are second-degree obese");
        } else {
            System.out.println("Your Body Mass Index: " + bmi + " and you are third degree obese");
        }
    }
    }
