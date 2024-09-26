public class stake {
    public static void main(String[] args) {
        double bet_amount=1.5;
        double multiplier=0.1;
        int n=50;
        for(int i=1;i<=n;i++){
            double inc_amount=bet_amount*multiplier;
            System.out.println("number of losses= "+i);
            System.out.println("increased amount= "+inc_amount);
            
            bet_amount=bet_amount+inc_amount;
            System.out.println("current bet amount= "+bet_amount);
            System.out.println("====================");
        }
    }
}
