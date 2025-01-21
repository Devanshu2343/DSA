// Print 1 to n  using recursion
import java.util.*;

public class OneToN {

    public static void printnum(int n){
       if(n<1){
        return ;
       }
       printnum(n-1);
       System.out.println(n);

    }

    public static void main(String[] args) {

        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printnum(n);
    
        

    }
    
}
