//a program in java to return index of target element in 2D array

import  java.util.*;
public class TwoDArray {
    public static int[] searchVal(int m ,int n ,int[][] nums ,int a){
           for (int i=0 ; i <m ;i++){
            for (int j=0 ; j<n ;j++){
                if (a == nums[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int m = sc.nextInt();
        System.out.println("Enter Colums : ");
        int n = sc.nextInt();
        int [][] nums = new int [m][n];
        System.out.println("Enter elments : ");
        for (int i =0 ; i < m ; i++){
            for (int j=0 ;j<n ;j++){
                nums[i][j]= sc.nextInt();
            }
        }
        for (int i =0 ; i < m ; i++){
            for (int j=0 ;j<n ;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("Enter any number to search in array : ");
        int a = sc.nextInt();
        int [] result = searchVal( m, n, nums , a);

        if (result == null){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at " + result[0] + result[1]);
        }
      

    }
    
}
