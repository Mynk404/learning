public class percntage {

    public static void perc(int m,int p,int c,int o){
        float percentage= ((m+p+c+o)/320.0f)*100;
        System.out.println("percentage of the student is = "+percentage);
    }

    public static void main(String[] args) {
        perc(65,55,67,51);
    }
    
}
