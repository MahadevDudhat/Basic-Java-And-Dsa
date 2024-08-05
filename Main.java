public class Main {

    static boolean pal(String str){
        int s = 0;
        int e = str.length()-1;

        while(s<e){
            if(str == null || str.length() == 0){
                return true;
            }
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        int x=5,y=8,z=10;

//        int k = "hello"+x;
        System.out.println("hello"+(x+y+z));

    }
}