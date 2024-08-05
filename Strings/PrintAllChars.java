package Strings;
import java.util.*;
public class PrintAllChars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int asch = (int)ch;
            System.out.println(ch+" "+asch);


        }

    }
}
