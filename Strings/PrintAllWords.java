package Strings;

import java.util.Scanner;

public class PrintAllWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        String w ="";
       str+=" ";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                w+=ch;
            }else{
                System.out.println(w);
                w="";
            }
        }
    }
}
