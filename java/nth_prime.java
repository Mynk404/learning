import java.util.*;

class nth_prime{
    static boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        return c==2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int k=sc.nextInt();
        for(int i=1; ;i++){
            if(isPrime(i)){
                c++;
            }
            if(c==k){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}