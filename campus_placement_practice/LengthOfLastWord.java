package campus_placement_practice;

import java.util.Scanner;

public class LengthOfLastWord {
    public static int findLength(String str){

       String s =  str.trim();
        int n = s.length();
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                cnt=0;
            }else {
                cnt++;
            }
        }
        return cnt;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        int ans = findLength(str);
        System.out.println(ans);
    }
}
