package Chapter5;
//Grades given in 100-degree system convert to letter system
import java.util.Scanner;
public class GradeConversion {
    public static void main(String[] args) {
        Scanner enteredGrade = new Scanner(System.in);
        System.out.println("Please your exam grade: ");
        double grade = enteredGrade.nextDouble();
        if(grade >= 88 && grade <= 100) {
            System.out.println("Your letter grade is AA");
        } else if (grade >= 80 && grade <= 87) {
            System.out.println("Your letter grade is BA");
        } else if (grade >= 73 && grade <= 79) {
            System.out.println("Your letter grade is BB");
        } else if (grade >= 66 && grade <= 72) {
            System.out.println("Your letter grade is CB");
        } else if (grade >= 60 && grade <= 65) {
            System.out.println("Your letter grade is CC");
        } else if (grade >= 55 && grade <= 59) {
            System.out.println("Your letter grade is DC");
        } else if (grade >= 50 && grade <= 54) {
            System.out.println("Your letter grade is DD");
        } else {
            System.out.println("Your letter grade is FF");
        }
    }
}
