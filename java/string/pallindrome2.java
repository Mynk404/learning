package string;

public class pallindrome2{

    static boolean check(String temp){
        for(int i=0,j=temp.length()-1;i<=j ;i++,j--){
            if (temp.charAt(i)!=temp.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="adgdaaadhjhikki";
        for(int i=0;i<s.length();i++){
            String temp=""+s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                temp=temp+s.charAt(j);
                if(check(temp)){
                    System.out.println(temp);
                }
            }
        }
    }
}