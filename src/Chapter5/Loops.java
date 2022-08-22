package Chapter5;
//print to the screen 5 times with use loops
public class Loops {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("I am learning Loops!");
        }
        int i=0;
        while(i<5){
            System.out.println("While loops");
            i++;
        }
        int j=0;
        do {
            System.out.println("Do while loops");
            j++;
        } while (j<5);
    }
}

