package ArrayQuestionSolving;

import java.util.Scanner;

public class FrequencyArray {

    public static int[] makeFrequency(int[] arr){
        int[] freq = new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elemenets in array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] freq = makeFrequency(arr);

        System.out.println("Enter the number of queries: ");
        int queries = sc.nextInt();

        while(queries>0){
            System.out.println("Enter number to be serached");
            int s = sc.nextInt();
            if(freq[s]>0){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            queries--;
        }

    }
}
