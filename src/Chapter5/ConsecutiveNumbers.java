package Chapter5;
// Print numbers from 1 to 10 in order and with a comma between
public class ConsecutiveNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i != 10) {
                System.out.print(",");
            }
        }
    }
}


