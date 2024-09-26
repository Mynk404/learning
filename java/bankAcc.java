

public class bankAcc {

    int pin;
    int balance;

    bankAcc(int pin,int balance){
        this.pin=pin;
        this.balance=balance;

    }

    void deposit(int amount){
        System.out.println("Amount to deposit: "+amount);
        balance+=amount;
    }

    void withdraw(int amount,int p){

        if (amount<=balance) {
            if(p==pin){
                System.out.println("amount withdrwan is: "+amount);
                balance-=amount;
            }
            else{
                System.out.println("Incorrect pin");
            }
        }
        else{
            System.out.println("insufficient funds");
        }
    }

    void viewbalance(int p){
        if(p==pin){
            System.out.println("Balance is: "+balance);
        }
        else{
            System.out.println("incorrect pin");
        }
    }
    
}
