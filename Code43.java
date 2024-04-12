// Date:28-03-2024 ,This is the journey of learning
//CodeWithSaumya: Code43

import java.util.Scanner;

public class Code43 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = input.nextInt();

        int first = 0, second = 1;
        System.out.println("Fibonacci Series till " + terms + " terms:");

        for (int i = 1; i <= terms; ++i) {
            System.out.print(first + " ");

            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }
}
