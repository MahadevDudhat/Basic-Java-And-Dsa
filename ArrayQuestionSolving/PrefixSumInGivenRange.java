package ArrayQuestionSolving;

import java.util.Scanner;

public class PrefixSumInGivenRange {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] makePrefixSumArray(int[] arr){
        int[] pref = new int[arr.length];
        pref[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the elements in array");
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);

        int[] pref = makePrefixSumArray(arr);
        System.out.println("prefix sum array");
        printArray(pref);

        System.out.println("Enter the total queries");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("Enter l");
            int l = sc.nextInt();
            System.out.println("Enter r");
            int r = sc.nextInt();
            int ans = pref[r]-pref[l-1];
            System.out.println("ans-> "+ans);
            q--;
        }
    }
}
