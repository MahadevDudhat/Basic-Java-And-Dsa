package Basic;

import java.util.Scanner;

public class CheckArmstrong {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the number is armstrong or not ");
        int n = sc.nextInt();
        int ch = n;
        int sum = 0;

        while(n>0){
            int num = n%10;
            sum+=(num*num*num);
            n /=10;
        }

        if(sum==ch){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
