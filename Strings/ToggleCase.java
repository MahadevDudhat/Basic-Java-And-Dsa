package Strings;

import java.util.Scanner;

public class ToggleCase
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        String ans = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int val = (int)ch;
            if(ch==' '){
                ans+=' ';
                continue;
            }
            if(val<97){
               int temp = val+32;
               ch = (char) temp;
               ans+=ch;
               temp=0;
            }else{
                int temp = val-32;
                ch = (char) temp;
                ans+=ch;
                temp=0;
            }
        }
        System.out.println(ans);
    }
}
