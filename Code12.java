// Date:17-03-2024 ,This is the journey of learning
//CodeWithSaumya: Code12
// Demonstration of block scope

public class Code12 {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x and y :" + x + " " + y);
            x = y * 2;
        }
        y = 100; // Error! y not known here
        System.out.println("x is " + x);
    }

}

// Output
// This fragment is wrong
// Y cannot be resolved to a variable