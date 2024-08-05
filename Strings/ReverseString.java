package Strings;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        String rev= "";
        int s = 0;
        int e = str.length()-1;
        for(int i=e;i>=0;i--){
            char ch = str.charAt(i);
            rev +=ch;
        }
        System.out.println(rev);
    }
}
