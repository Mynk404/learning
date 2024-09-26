public class monthwstr {
    public static void main(String[] args) {
        String month="Feb";
        if(month=="Feb"){
            System.out.println("Number of days are 28/29");
        }
        else{
            if (month=="Jan" || month=="Mar" || month=="May" || month=="Jul" || month=="Aug" || month=="Oct" || month=="Dec") {
                System.out.println("The number of days are 31");
            }
            else{
                System.out.println("Number of days are 30");
            }
        }
    }
}
