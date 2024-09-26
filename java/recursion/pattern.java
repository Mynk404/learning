package recursion;

public class pattern {
    static int m;
    static void col(int n){
        if(n>=1){
            System.out.print("* ");
            col(n-1);
        }
    }

    static void row(int n){
        if(n>=1){
            col(m);        
            System.out.println();
            row(n-1);
        }
    }
    public static void main(String[] args) {
        int x=5;
        m=x;
        row(x);
    }
}
