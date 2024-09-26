public class armstrong {
    public static void main(String[] args) {
        int n=153,c=0,sum=0,a=0,n1=n,n2=n;
        while(n1>0){
         n1=n1/10;
         c++;
        }
 
        while(n>0){
         int b=1;
         a=n%10;
 
         for(int i=1;i<=c;i++){
             b=b*a;
         }
         sum+=b;
         n=n/10;
 
        }
        System.out.println(sum);
         
        if(sum==n2){
         System.out.println("armstrong number");
        }
        else{
         System.out.println("not an armstrong number");
        }
     }
 
}
