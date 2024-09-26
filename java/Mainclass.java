class Mainclass{
    public static void main(String[] args) {
        
        bankAcc b1=new bankAcc(1234, 100000);
        b1.viewbalance(1234);
        b1.deposit(25000);
        b1.viewbalance(1234);
        b1.withdraw(40000, 1234);
        b1.viewbalance(1234);
        

    }
}