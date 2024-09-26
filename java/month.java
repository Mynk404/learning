public class month {
    public static void main(String[] args) {
        int month=2;
        if(month==2){
            System.out.println("Number of days are 28/29");
        }
        else{
            if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
                System.out.println("The number of days are 31");
            }
            else{
                System.out.println("Number of days are 30");
            }
        }
    }
}
