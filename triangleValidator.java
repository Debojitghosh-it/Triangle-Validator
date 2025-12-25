import java.util.Scanner;

public class triangleValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the angles of the triangle: ");
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();

        // FIX 1: Changed >180 to ==180
        if (a1 + a2 + a3 == 180 && a1 > 0 && a2 > 0 && a3 > 0) {
            System.out.println("This is a valid triangle..");

            if (a1 == a2 && a1 == a3) {
                System.out.println("This is an Equilateral triangle..");
            } else if (a1 == a2 || a2 == a3 || a1 == a3) {
                System.out.println("This is an isosceles triangle..");
            } else {
                System.out.println("This is a Scalene triangle..");
            }
            
        } else {
            System.out.println("Not a valid triangle, angle sum should be 180°");
        }

        input.close(); // Moved outside the if-block to ensure it always closes
    }
}