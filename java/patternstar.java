import java.util.*;

public class patternstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            //*
            //  *       
            //    *     
            //      *   
            //        * 
            //     if(i==j){
            //         System.out.print("* ");
            //     }
             if(i+j>=n+2){
                 System.out.print("  ");
             }
            // if ((i-j>=1)) {
            //     System.out.print("  ");
            // }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
