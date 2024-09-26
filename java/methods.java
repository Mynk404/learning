public class methods {
    public static void square(int n){
        System.out.println("square method started");
        
        System.out.println("the square of "+n+" is "+(n*n));
        System.out.println("square method ended");
    }
    public static void main(String[] args) {
        System.out.println("main method started");
        square(5);
        square(6);
        square(7);
        System.out.println("main method ended");
    }
}
