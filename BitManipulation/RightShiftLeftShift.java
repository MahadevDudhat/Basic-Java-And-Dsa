package BitManipulation;

import java.util.Scanner;

public class RightShiftLeftShift {

    public static void leftShift(int num,int bits){

        double ans = (int)(num * Math.pow(2,bits));
        System.out.println("leftshift "+ans);
    }

    public static void rightShift(int num,int bits){
        double ans = (int)(num/Math.pow(2,bits));
        System.out.println("rightShift "+ans);
    }

    public static void main(String[] args) {
        int a = 7;
        //7->111 rigth shift by 2=>001 ->1
        System.out.println(a>>2);

        int b = 15;
        //15->1111 left shift by 2
        System.out.println(b<<2);

        //now same stuff without using that operators
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want rightshift and leftshift operation answer");
        int n = sc.nextInt();
        System.out.println("Enter how many bits to be shifted");
        int m = sc.nextInt();
        rightShift(n,m);
        leftShift(n,m);

    }
}
