import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<=n;i++){
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
            if(freq.get(arr[i])==1){
                System.out.println(arr[i]);
                break;
            }


        }

        
        }

    }