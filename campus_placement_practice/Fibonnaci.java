package campus_placement_practice;

public class Fibonnaci {
    public static int findFibbo(int n){
    if(n<=1){
        return n;
    }
    return findFibbo(n-1)+findFibbo(n-2);
    }
    public static void main(String[] args) {
        int ans = findFibbo(3);
        System.out.println(ans);
    }
}
