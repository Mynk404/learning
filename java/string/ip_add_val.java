package string;

import java.util.regex.Pattern;

public class ip_add_val {
    public static void main(String[] args) {
        String s="192.44.56.25";
        String[] arr=s.split("[.]");
        int flag=0;
        if (arr.length==4) {
            for(int i =0;i<arr.length;i++){
        
                if(Pattern.matches("[0-9]*", arr[i])==false){
                    
                    flag=1;
                    break;
                }
                else if(Pattern.matches("[0-9]*",arr[i])){
                    int n=Integer.parseInt(arr[i]);
                    if(n<0 || n>=255){
                        flag=1;
                        break;
                    }
                }
                
            }
            if(flag==1){
                System.out.println("invalid ip");
            }
            else{
                System.out.println("valid ip");
            }
        }
        else{
            System.out.println("invalid ip");
        }

    
    }
}
