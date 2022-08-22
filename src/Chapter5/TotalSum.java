package Chapter5;
//Find the sum of numbers from 1 to 100
public class TotalSum {
    public static void main(String[] args) {
        int sum =0;
        int lastNumber=100;

        for(int i=1; i <= lastNumber; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }
}
