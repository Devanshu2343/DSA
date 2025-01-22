// Print factorial of n using recursion
import java.util.*;

public class Factorial {

    public static int fact(int n){
      if (n <= 1){
        return 1 ;
      } 
      return n*fact(n-1);
    }

    public static void main(String[] args) {

        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = fact(n);
        System.out.println(res);
    
        

    }
    
}

