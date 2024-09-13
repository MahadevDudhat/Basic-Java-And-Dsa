package BitManipulation;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void toDecimal(int n){
        int ans =0;
        int p=0;
        while(n>0){
            int r = n%10;
            ans+=r*Math.pow(2,p);
            p++;
            n/=10;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to convert into decimal");
        int num = sc.nextInt();
        toDecimal(num);
    }
}
