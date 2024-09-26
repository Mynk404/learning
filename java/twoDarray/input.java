package twoDarray;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give rows for the array: ");
        int r=sc.nextInt();
        System.out.println("give columns for the array: ");
        int c=sc.nextInt();
        int[][] arr= new int[r][c];
        System.out.println("give the array elements: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the array is as follows: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
