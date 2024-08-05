package Arrays;

import java.util.Scanner;

public class SearchElement {
    static void takeInput(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }


    static int searchElement(int arr[],int x){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return  i;
            }
        }
        return -1;
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


        System.out.print("Enter the element which you want to find: ");
        int x = sc.nextInt();
        int ans = searchElement(arr,x);
        if (ans!=-1){
            System.out.println("Element found at "+(ans+1)+" location");
        }else{
            System.out.println("element not found");
        }

    }
}
