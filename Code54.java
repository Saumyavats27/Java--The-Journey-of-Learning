import java.util.*;

public class Code54 {
    public static int LinearSearch(int arr[], int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 99, 81, 665, 11096 };
        System.out.println("Enter Value to Find in the intialize array");
        int value = sc.nextInt();
        int index = LinearSearch(arr, value);
        if (index == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at index " + index);
        }
    }

}
