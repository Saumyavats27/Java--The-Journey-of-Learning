import java.util.*;

public class Code55 {
    public static int BinarySearch(int arr[], int val) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == val) {
                return mid;
            }

            if (arr[mid] < val) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // value not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 99, 81, 665, 11096 };
        System.out.println("Enter Value to Find in the intialize array");
        int value = sc.nextInt();
        int index = BinarySearch(arr, value);
        if (index == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at index " + index);
        }
    }

}
