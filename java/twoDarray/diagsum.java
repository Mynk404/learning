package twoDarray;



public class diagsum{
    public static void main(String[] args) {
    int[][] arr = { {1,2,3} , {5,4,7}, {8,4,3} };
    int suml=0;
    int sumr=0;
    for(int i=0;i<arr.length;i++){
        for (int j = 0; j < arr[i].length; j++) {
            if(i==j){
                suml+=arr[i][j];
            }
            if (i+j==arr.length-1) {
                sumr+=arr[i][j];
            }
        }
        
    }
    System.out.println(suml);
        System.out.println(sumr);
    }
}
    
  



