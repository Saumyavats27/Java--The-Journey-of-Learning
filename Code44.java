// Date:28-03-2024 ,This is the journey of learning
//CodeWithSaumya: Code44

import java.util.Scanner;

public class Code44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " = " + factorial);
    }

}
