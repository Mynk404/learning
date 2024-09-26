public class fibb {
   public static void main(String[] args) {
    int i=1,n=1000;

    int n1=0,n2=1,sum=0;
    int c=1;

    while(i<=n){
        if(c==4){
             System.out.println(n1);
        }
        sum=n1+n2;
        n1=n2;
        n2=sum;
        i++;
        c++;
    }
   }
}
