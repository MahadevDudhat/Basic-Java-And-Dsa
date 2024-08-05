package Strings;

import java.util.Scanner;

public class StringCompression
{
    public static void compression1(String str){
        String ans = str.charAt(0)+"";

        for(int i=1;i<str.length();i++){

            char ch1  = str.charAt(i-1);
            char ch2 = str.charAt(i);

            if(ch1!=ch2){
                ans+=ch2;
            }

        }
        System.out.println(ans);
    }

    public static void compression2(String str){
        int count = 1;
        String ans = str.charAt(0)+"";
        for(int i=1;i<str.length();i++){
            char ch1  = str.charAt(i-1);
            char ch2 = str.charAt(i);
            if(ch1==ch2){
                count++;
            }else{
                if(count>1){
                    ans+=count;
                    count = 1;
                }
                ans+=ch2;
            }
        }

        if(count>1){
            ans+=count;
        }
        System.out.println(ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        compression1(str);
        compression2(str);
    }

}
