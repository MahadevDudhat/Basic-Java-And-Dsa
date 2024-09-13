package BitManipulation;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void decimalToAnyBase(int num,int base){
        int ans = 0;
        int p = 1;
        while(num>0){

            int rm = num%base;
            num/=base;
            ans+=rm*p;
            p *=10;

        }
        System.out.println(ans);
    }
    public static void main(String[] arf){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want convert into some base");
        int num = sc.nextInt();
        System.out.println("Enter the base into which you want to convert the given number");
        int base = sc.nextInt();
        decimalToAnyBase(num,base);
    }
}
