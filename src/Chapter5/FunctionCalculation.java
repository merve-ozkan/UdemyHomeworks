package Chapter5;
//function calculation for x and y values entered from the keyboard
import java.util.Scanner;
public class FunctionCalculation {
    public static void main(String[] args) {

        Scanner enteredValue = new Scanner(System.in);
        System.out.println("Please enter x value: ");
        double xValue = enteredValue.nextDouble();
        System.out.println("Please enter y value: ");
        double yValue = enteredValue.nextDouble();

        if(xValue > 0 && yValue <0){
            double function = ((4*xValue)+(2*yValue)+4);
            System.out.println(function);
        } else if (xValue>0 && yValue == 0) {
            double funtion = ((2*xValue)-yValue+3);
            System.out.println(funtion);
        } else if (xValue < 0 && yValue > 0) {
            double function = ((3*xValue)+(4*yValue)+3);
            System.out.println(function);
        } else{
            System.out.println("The function can not be calculated, check the values!");
        }
    }
}
