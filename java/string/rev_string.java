package string;
//question --> if the input is "hello hi bye welcome" then the output should be "welcome bye hi hello"
public class rev_string {
    public static void main(String[] args) {
        String s="bhartiya janta party";
        String[] ans=s.split(" ");
        for(int i=ans.length-1;i>=0;i--){
            System.out.print(ans[i]+" ");
        }
    }
}
//using split() inbuilt method for string we can split the string into an array of various strings with the seperator give inside split() method as it accepts regex values.


