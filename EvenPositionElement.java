// Given an array of elements print all its elements only at odd positions in the same order seperated by space

import java.util.Scanner;

public class EvenPositionElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[100];
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            arr[i]=a;
        }
        // method 1

        for(int i =1;i<n;i+=2){
            System.out.print(i+" ");
        }
//iterations: O(n/2)
//T(c)= O(n)
//S(c)= O(n)
        

        //method2

        for(int i =1;i<n;i++){
            if(i%2==1)
            System.out.print(i+" ");
        }
//iterations: O(n)
//T(c)= O(n)
//S(c)= O(n)

    }
}

