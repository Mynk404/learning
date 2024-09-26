// 11 12 13 14 15 
// 21 22 23 24 25
// 31 32 33 34 35
// 41 42 43 44 45
// 51 52 53 54 55

public class pattern_nums {
    public static void main(String[] args) {

        int v=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                // 1
                // 1 2
                // 1 2 3
                // 1 2 3 4
                // 1 2 3 4 5


                // if(i-j>=0){
                //     System.out.print(j+" ");                             
                // }
                // else{
                //     System.out.print("  ");
                // }


                // 1
                // 2 2
                // 3 3 3
                // 4 4 4 4
                // 5 5 5 5 5                
                // if(i-j>=0){
                //     System.out.print(i+" ");
                // }
                // else{
                //     System.out.print("  ");
                // }
                if(i>j){
                    System.out.print(v+++" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
