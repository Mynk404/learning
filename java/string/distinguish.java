package string;

public class distinguish {
    public static void main(String[] args) {
        String str="Abj452kL%@33";
        String alpha="",num="",sp="";


        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a' && str.charAt(i)<='z') ){
                alpha=alpha+str.charAt(i);
            }
            else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                num=num+str.charAt(i);
            }
            else{
                sp=sp+str.charAt(i);
            }

        }
        

        System.out.println(alpha+num+sp);
    }
}
