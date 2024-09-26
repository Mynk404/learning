//make a bank type scenario with the features like deposit, withdraw ,change pin ,check balance


public class Person {
    int pin,balance;
    void updatePin(int p){
        this.pin=p;
    }
    
    void deposit(int d,int p){
        if(p==this.pin){
            this.balance+=d;
        }
        else{
            System.out.println("incorrect pin");
        }
        
    }
     void withdraw(int w,int p){
        if(p==this.pin){
            this.balance-=w;
        }
        else{
            System.out.println("incorrect pin");
        }
     }

    public static void main(String[] args) {
        Person p1=new Person();
        p1.updatePin(1234);
        System.out.println("New pin is:"+p1.pin);
        System.out.println("old balance was:"+p1.balance);
        p1.deposit(23000,1234);
        System.out.println("the new balance is:"+p1.balance);
        p1.withdraw(2000,1234);
         System.out.println("the new balance after withdrawal is:"+p1.balance);
    }
}
