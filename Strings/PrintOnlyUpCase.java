package Strings;

import java.util.Scanner;

public class PrintOnlyUpCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++){
            char ch  = str.charAt(i);
            int val = (int)ch;

            if(val>=65 && val<97){
                System.out.println(ch);
            }
        }

    }
}
