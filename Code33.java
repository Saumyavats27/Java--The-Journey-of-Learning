// Date:25-03-2024 ,This is the journey of learning
//CodeWithSaumya: Code33
public class Code33 {
    public static void main(String[] args) {
        int term = 6;
        for (int i = 1; i <= term; i++) {
            for (int j = term; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();// new line
        }
    }
}
