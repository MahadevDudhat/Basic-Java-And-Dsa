package campus_placement_practice;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0){
            int v = n%10;
            rev = rev*10 + v;
            n/=10;
        }
        System.out.println("Reverse is");
        System.out.println(rev);
    }
}
