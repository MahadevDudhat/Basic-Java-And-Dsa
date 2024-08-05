package Strings;

import java.util.Scanner;

public class AsciiDiff
{
    public static void printAsciDiff(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int diff = (int)(curr-prev);
            sb.append(diff);
            sb.append(curr);
        }
        System.out.println(sb);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();

        printAsciDiff(str);
    }
}
