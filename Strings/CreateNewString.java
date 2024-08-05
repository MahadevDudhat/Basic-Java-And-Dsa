package Strings;

import java.util.Scanner;

public class CreateNewString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        String ans = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                ans+=ch;
            }
        }
        System.out.println(ans);

    }
}
