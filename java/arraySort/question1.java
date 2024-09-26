public class question1 {
    public static void main(String[] args) {
        String s="bheem";
        char[] arr=s.toCharArray();

        

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                char temp=0;
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        String ans=new String(arr);
        System.out.println(ans);
    }
}
