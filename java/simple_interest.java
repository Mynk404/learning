public class simple_interest {

    public static void simpl_intrst(int p,float r, int t){
        float amount=p*(1+(r*t));
        System.out.println("amount after 3 years is = "+amount);
    }

    public static void main(String[] args) {
        simpl_intrst(15000,0.15f,3);
    }
}
