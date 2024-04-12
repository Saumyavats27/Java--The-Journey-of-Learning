// Date:17-03-2024 ,This is the journey of learning
//CodeWithSaumya: Code13
//Demonstrate lifetime of a variable.

public class Code13 {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 4; x++) {
            int y = -1;
            System.out.println("y is :" + y);
            y = 100;
            System.out.println("y is now : " + y);
        }
    }

}
