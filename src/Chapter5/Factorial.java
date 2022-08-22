package Chapter5;
import java.util.Scanner;
//factorial of a number entered from the keyboard
public class Factorial {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter the number you want to factorial: ");
        double factorial = number.nextDouble();
        double multiplication =1;
        for(int i=1; i <= factorial; i++){
            multiplication *=i;
        }
        System.out.println(multiplication);
    }
}
