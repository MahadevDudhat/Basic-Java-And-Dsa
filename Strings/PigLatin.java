package Strings;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        //EAT-->EATWAY
        //CLEAR-->EARCLAY
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        String ans ="";
        for(int i=0;i<str.length();i++){
            char ch =  str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                if(i==0){
                    ans=str+"WAY";
                    break;

                }else{
                    ans=str.substring(i-1)+str.substring(0,i-1)+"AY";
                }
            }
        }
        System.out.println(ans);
    }
}
