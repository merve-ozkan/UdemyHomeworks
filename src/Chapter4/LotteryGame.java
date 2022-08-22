package Chapter4;
import java.util.Scanner;
public class LotteryGame {
    public static void main(String[] args) {
        int generatedNumber = (int) ((Math.random() * 91) + 10);
        int unitsDigit2 = generatedNumber % 10;
        int tensDigit2 = generatedNumber / 10;
        System.out.println("Enter two digit number: ");
        Scanner number = new Scanner(System.in);
        int guessedNumber1 = number.nextInt();
        int unitsDigit = guessedNumber1 % 10;
        int tensDigit = guessedNumber1 / 10;
        int guessedNumber2 = (unitsDigit * 10) + tensDigit;
        if (guessedNumber1 == generatedNumber) {
            System.out.println(" Congratulations! Won 10000 $ !");
        } else if (generatedNumber == guessedNumber2) {
            System.out.println(" Congratulations! Won 5000 $ ! Lucky number: " + generatedNumber);
        } else if (unitsDigit == unitsDigit2) {
            System.out.println(" Congratulations! Won 1000 $ ! Lucky number: " + generatedNumber);
        } else if (tensDigit == tensDigit2) {
            System.out.println(" Congratulations! Won 1000 $ ! Lucky number: " + generatedNumber);
        } else {
            System.out.println(" Won Nothing! Lucky number: " + generatedNumber);
        }
    }
}