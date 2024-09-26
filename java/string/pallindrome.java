package string;

public class pallindrome {
    static boolean palli(String s){
        
        for(int i=0,j=s.length()-1;i<=j ;i++,j--){
            if (s.charAt(i)!=s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        if(palli("level")){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }
    }
}
