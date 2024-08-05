package Strings;

import java.util.Scanner;

public class PrintAllPalindromicSubStrjings
{
    public static boolean isPalli(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1!=ch2){
                return false;
            }else{
                i++;
                j--;
            }
        }

        return true;
    }
    public static void printPaliSS(String str){
     for(int i=0;i<str.length();i++){
         for(int j=i+1;j<=str.length();j++){
             String ss = str.substring(i,j);
             if(isPalli(ss)==true){
                 System.out.println(ss);
             }
         }
     }
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        printPaliSS(str);

    }
}
