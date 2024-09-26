package recursion;
public class sum {
    static int sum=0;
    static int sumn(int n){
        if(n<=10){
            sum+=n;
            sumn(n+1);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumn(1));
    }
}
