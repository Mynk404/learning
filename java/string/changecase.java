package string;

public class changecase {
    public static void main(String[] args) {
        String str="HelLo231 @ByE HI";
        String ans="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (c>='A'&& c<='Z') {
                
                c+=32;
            }
            else if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
                c-=32;
            }
            ans=ans+c;           
        }
        System.out.println(ans);
    }
}
