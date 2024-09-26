package recursion;

public class fibon {
    static int n1=0,n2=1,sum=0;
    
    static void fibo(int n){
        if(n>=1){
            System.out.println(n1);
            sum=n1+n2;
            n1=n2;
            n2=sum;
            
            fibo(n-1);
        }
    }
    public static void main(String[] args) {
        fibo(10);
    }
}
