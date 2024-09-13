package ArrayAndString;

import java.util.Scanner;

public class FaultyKeyboard {
    public static boolean findAns(String str,String t){
        char[] arr = str.toCharArray();
        char[] brr = t.toCharArray();
        int i=0;
        int j=0;
        while(i<arr.length && j<brr.length){
            if(arr[i]==brr[j]){
                i++;
                j++;
            }else if(i>0 && brr[j]==arr[i-1]){
                j++;
            }else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter actual string ");
        String str = sc.nextLine();
        System.out.println("Enter typed string ");
        String typed = sc.nextLine();
        //faulty keyboard
        System.out.println(findAns(str,typed));



    }
}
