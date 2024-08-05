package Arrays;

import java.util.Scanner;

public class FindLastOccurence {
    static void takeInput(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }


    static int findLastOcc(int arr[],int x){
        int count = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count = arr[i];
            }
        }

        return count;
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


        System.out.print("Enter the element which you want to find last occurence: ");
        int x = sc.nextInt();

        int cnt = findLastOcc(arr,x);
        System.out.println(cnt);


    }
}
