package campus_placement_practice;

import java.util.HashMap;

public class vovelPermutation {
    static boolean isConsonent(char ch){
        if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return false;
        }
        return true;
    }

    static int fact(int n){
        int ans=1;
        for(int i=n;i>=1;i--){
            ans*=i;
        }
        return ans;
    }


    static int perm(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isConsonent(s.charAt(i))){
                count++;
                if(map.containsKey(s.charAt(i))){
                    map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }
            }
        }
        int quos=fact(count);
        int div=1;
        for(char ch:map.keySet()){
            int num=map.get(ch);
            div*=fact(num);
        }
        return quos/div;
    }
    public static void main(String[] args) {
        int ans=perm("abbccdee");
        System.out.println(ans);
    }
}
