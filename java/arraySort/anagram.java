public class anagram{

    static String sort(char[] arr,int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                char temp=0;
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        String s=new String(arr);
        return s;
    }
    public static void main(String[] args) {
        String s1="hello";
        String s2="lelho";
        int n=s1.length();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        String ans1=sort(c1,n);
        String ans2=sort(c2,n);

        if(ans1.equals(ans2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}