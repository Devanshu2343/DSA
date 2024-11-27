import java.util.Scanner;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = 0;         
        int maxLength = 0;     

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                length++;    
            } else {
                maxLength = Math.max(length, maxLength);  
                length = 0;   
            }
        }

        maxLength = Math.max(length, maxLength);

        return maxLength;  
    }

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array (0 or 1): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution solution = new Solution();

        int result = solution.findMaxConsecutiveOnes(nums);
        System.out.println("The maximum number of consecutive 1's is: " + result);
       
        sc.close();
    }
}