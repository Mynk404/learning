package string;

public class numsum {
    public static void main(String[] args) {
        String s="ab4c2f2 h133";
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                ans+=(c-48);
            }
        }
        System.out.println(ans);
    }
}
