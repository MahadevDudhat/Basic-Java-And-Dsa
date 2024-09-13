package campus_placement_practice;

import java.util.Scanner;

public class ReverseTheString {
    public static void reverseString(String str){
        StringBuilder sb = new StringBuilder("");
        char[] arr = str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        reverseString(str);

    }
}
