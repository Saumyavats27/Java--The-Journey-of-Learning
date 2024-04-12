// Date:27-03-2024 ,This is the journey of learning
//CodeWithSaumya: Code40

import java.util.Scanner;

public class Code40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

}
