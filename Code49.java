// Date:30-03-2024 ,This is the journey of learning
//CodeWithSaumya: Code49
public class Code49 {
    public static void main(String[] args) {
        int number = 5; // Change this to calculate factorial of another number
        long factorial = 1;

        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

}
