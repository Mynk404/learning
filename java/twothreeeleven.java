public class twothreeeleven {

    public static void m1(int n){
        if(n%11==0){
            System.out.println("Eleven");
        }
        else if(n%3==0){
            System.out.println("Three");
        }
        else if (n%2==0){
            System.out.println("Two");
        }
        else {
            System.out.println("not div by 2,3 or 11");
        }
    }

    public static void main(String[] args) {
        m1(6);
    }
}
