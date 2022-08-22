package Chapter5;
//Finding the type of triangle according to the edge lengths
import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {
        Scanner edge = new Scanner(System.in);
        double edge1 = edge.nextDouble();
        double edge2 = edge.nextDouble();
        double edge3 = edge.nextDouble();
        if(edge1 == edge2 && edge1 == edge3 && edge2 == edge3) {
            System.out.println("equilateral triangle");
        } else if ((edge1 == edge2 && edge1 != edge3)) {
            System.out.println("isosceles triangle");
        } else if ((edge1 == edge3 && edge1 != edge2)) {
            System.out.println("isosceles triangle");
        } else if ((edge2 == edge3 && edge2 != edge1)) {
            System.out.println("isosceles triangle");
        } else {
            System.out.println("scalene triangle");
        }
    }
}
