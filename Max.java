import java.util.Scanner;

public class Max {
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

        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]*=2;
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("max = "+max);
    }
}
