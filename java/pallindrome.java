public class pallindrome {
    public static void main(String[] args) {
         int n=5;
         int c=0;
         int[] arr1={1,2,4,2,1};
         int[] arr2=new int[n];

         for(int i=0;i<n;i++){
            arr2[n-1-i]=arr1[i];
        }
        for(int i=0;i<n;i++){
            if (arr1[i]==arr2[i]) {
                 c++;
             }
         }
         if(c==n){
             System.out.println("pallindrome");
         }
         else{
             System.out.println("not a pallindrome");
         }
        
    }
}
