// Date:27-03-2024 ,This is the journey of learning
//CodeWithSaumya: Code37

import java.util.Scanner;

public class Code37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);
    }

}
