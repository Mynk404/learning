package string;

public class alternateElim {
    public static void main(String[] args) {
        String s="jspiders";
        System.out.println(s);
        int i=0,j=s.length()-1;
        for(int k=0;k<s.length();k++){
            if(k%2==0) j--;
            else i++;
            String ans="";
            for(int m=i;m<j;m++){
                ans=ans+s.charAt(m);
            }
            System.out.println(ans);
        }
    }
}
