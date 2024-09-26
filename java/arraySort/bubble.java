public class bubble {
    

   public static void main(String[] args) {
    int[] arr= {505,31,4202,20001,2331};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1-i;j++){
            int temp=0;
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }

    for(int i =0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
   }
}
