package Arrays;

import java.util.Scanner;

public class FindSum1D {

    static void takeInput(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }

    static void findSum(int arr[]){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("Sum of elements of an array are: "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [];
        int size;

        System.out.print("Enter the size of an Array: ");
        size = sc.nextInt();

        arr = new int[size];

        System.out.print("Enter the"+size+"elements in Array: ");
        takeInput(arr,size);

        findSum(arr);

    }
}
