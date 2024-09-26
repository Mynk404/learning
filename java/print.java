import java.util.*;

public class print {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:-");
        int n=sc.nextInt();
        int a=n, c=0;
        while(a>0){
            a/=10;
            c++;
        }
        int sum1= n/(int)(Math.pow(10, c/2));
        int sum2= n%(int)(Math.pow(10, c/2));
        System.out.println(sum1+sum2);
        sc.close();
    }
}
