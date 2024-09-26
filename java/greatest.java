public class greatest {
    public static void main(String[] args) {
        int a=10,b=70,c=40,d=50,e =60;
        
        if (a>b && a>c && a>d &&a>e ) {
            System.out.println(a);
        }
        else if (b>c && b>d && b>e) {
            System.out.println(b);
        }
        else if(c>d && c>e){
            System.out.println(c);
        }
        else if (d>e) {
            System.out.println(d);
        }
        else{
            System.out.println(e);
        }
    }
}
