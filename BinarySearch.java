import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) return mid;
            if (array[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        Arrays.sort(array);
        int result = binarySearch(array, target);

        if (result != -1) System.out.println("Found at index: " + result);
        else System.out.println("Not found.");
        
        scanner.close();
    }
}
