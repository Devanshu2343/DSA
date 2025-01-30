import java.util.*;

public class BinarySearchUsingRecursion {
    public static int helper(int [] arrNew ,int st ,int end , int tar) {
       while (st <= end){
        int mid  = st + (end -st)/2 ;
        if (tar > arrNew[mid]){
            return helper(arrNew, mid+1, end, tar);
        }else if (tar < arrNew[mid]){
            return helper(arrNew, st, mid-1, tar);
        }else{
            return mid ;
        }
       }
       return -1 ;

    }
    public static void main(String[] args) {
        int [] arrNew = new int [] {11,23,65,78,89,94,98,99};
        int n = arrNew.length;
        int start =0 ; 
        int end = n-1 ;
        int target = 9 ;

        int res = helper (arrNew, start,end ,target);
        System.out.println(res);
    }
    
}
