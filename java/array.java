import java.util.*;

public class array {
    public static void main(String[] args) {
        // int[] arr={3,4,19,22,6};
        // int a=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>=arr[i-1]){
        //         a=arr[i];
        //     }
        // }
        // System.out.println(a);
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
