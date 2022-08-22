package Chapter5;
//Student's passing status according to midterm and final grades
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter your midterm grade: ");
        double midterm = grade.nextDouble();
        System.out.println("Enter your final grade: ");
        double finalGrade = grade.nextDouble();
        double passGrade = (midterm*0.4)+(finalGrade*0.6);
        if(passGrade >= 50) {
            System.out.println("You are passed!");
        } else {
            System.out.println("You are failed!");
        }
    }
}
