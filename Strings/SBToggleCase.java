package Strings;

import java.util.Scanner;

public class SBToggleCase
{
    public static String toggleCase(String str){

        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            int asc = (int)ch;

            if(asc>=65 && asc<=91){
                int temp = asc+32;
                char t = (char)temp;
                sb.setCharAt(i,t);

            }else if(asc>=97 && asc<=123){
                int temp = asc-32;
                char t = (char)temp;
                sb.setCharAt(i,t);
            }

        }


        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();

        System.out.println(toggleCase(str));

    }
}
