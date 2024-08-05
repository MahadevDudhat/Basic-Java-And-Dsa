package Basic;

import java.util.Scanner;

public class OptimizedPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");

        int n = sc.nextInt();
        int cnt =0;

        for(int i = 2;i*i<=n;i++){

            if(n%i==0){
                cnt++;
                break;
            }

        }

        if(n==1){
            System.out.println("Number is not prime nor composite");

        } else if (cnt==0) {
            System.out.println("number is prime");
        }else {
            System.out.println("number is not prime");
        }


    }

}
