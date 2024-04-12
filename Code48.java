// Date:30-03-2024 ,This is the journey of learning
//CodeWithSaumya: Code48
public class Code48 {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

}
