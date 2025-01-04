import java.util.Scanner;
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);
        
        if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Indices of the two numbers are: [" + result[0] + ", " + result[1] + "]");
        }

        scanner.close();
    }
}
