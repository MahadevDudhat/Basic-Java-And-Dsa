package Strings;

import java.util.Scanner;

public class ToConvertUpperOrLower {
    public static void convert(String str){
        int upCnt =0;
        int loCnt = 0;
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            int val = (int)ch;
            if(val>97){
                loCnt++;
            }else{
                upCnt++;
            }
        }

        if(loCnt>upCnt){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str.toUpperCase());
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        convert(str);

    }
}
