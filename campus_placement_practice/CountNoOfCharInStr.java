package campus_placement_practice;

import java.util.Scanner;

public class CountNoOfCharInStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' '){
                ans++;
            }
        }
        System.out.println(ans);
    }

}
