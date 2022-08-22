package Chapter5;
//average of three number
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        double number1 = number.nextDouble();
        double number2 = number.nextDouble();
        double number3 = number.nextDouble();
        double average = (number1 + number2 + number3)/3;
        System.out.println(average);
    }
}
