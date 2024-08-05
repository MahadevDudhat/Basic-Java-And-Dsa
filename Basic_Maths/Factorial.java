package Basic_Maths;
import java.util.*;

public class Factorial {

    public static int findFact(int n){
        if(n==0){
            return 1;
        }
        int ans = 1;
        while(n!=1){

            ans = ans * n;
            n--;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want to printfactorial");
        int num = sc.nextInt();
        System.out.println("Factorial of number is: ");
       int ans = findFact(num);
        System.out.println(ans);
    }
}
