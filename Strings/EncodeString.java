package Strings;

import java.util.Scanner;

public class EncodeString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        String ans = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int val = (int)ch;
            int temp = val+2;
            char t = (char)temp;
            ans+=t;
            temp=0;
        }
        System.out.println(ans);
    }
}
