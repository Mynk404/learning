public class pancard {
    public static void main(String[] args) {
        int balance=75000;
        int amount=200000;
        boolean pancard= false;

        if (amount<100000 || pancard==true) {
            balance=balance+amount;
        }
        else {
            System.out.println("Link pancard");
        }

        System.out.println("bsdiwala ka balance is = "+balance);
    }
}
