package campus_placement_practice;
public class vowel {
    public static boolean isVovel(char ch){
        boolean flag=false;
        if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            flag=true;
        }
        return flag;
    }
    public static String vovel(String s){
        String ans="";
        ans+=s.charAt(0);
        for(int i=1;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(isVovel(ch) && !isVovel(s.charAt(i-1)) && !isVovel(s.charAt(i+1))){
                continue;
            }else{
                ans+=s.charAt(i);
            }
        }
        ans+=s.charAt(s.length()-1);
        return ans;
    }
    public static void main(String[] args) {
        String ans=vovel("applesarefallingfromtheskies");
        System.out.println(ans);
    }
}
