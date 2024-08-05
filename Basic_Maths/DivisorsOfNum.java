package Basic_Maths;

import java.util.ArrayList;
import java.util.Collections;

public class DivisorsOfNum {
    public static void optimal(int n){
        ArrayList<Integer>list =new  ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if (n%i==0){
                list.add(i);
            }
            if((n/i)!=i){
                list.add(n/i);
            }

        }

        Collections.sort(list);
        System.out.println(list);
    }
    public static void brute(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        brute(36);
        System.out.println("-----------------");
        optimal(36);
    }
}
