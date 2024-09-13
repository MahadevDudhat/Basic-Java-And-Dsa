package BitManipulation;

import java.util.Scanner;

public class DecimalToBinary {

    public static void toBinary(int n){
        int ans =0;
        int p = 1;
        while(n>0){
            int r = n%2;
            n/=2;
            ans+=r*p;
            p*=10;

        }
        System.out.println(ans);
    }

    public static void main(String[] arfd){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to convert into the binary");
        int n  = sc.nextInt();
        toBinary(n);
    }
}
