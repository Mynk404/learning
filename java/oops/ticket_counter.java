package oops;

public class ticket_counter {
    int counterNumber;
    int no_of_tickets;
    int num=1001;

    ticket_counter(int counterNumber,int no_of_tickets){
        this.counterNumber=num++;
        this.no_of_tickets=no_of_tickets;
    }

    void buy(int n){
        System.out.println("Buying "+n+" Tickets from counter number "+counterNumber);
        if(no_of_tickets>=n){
            no_of_tickets-=n;
            System.out.println("Bought tickets!");
        }
        else{
            System.out.println("Tickets not available");
        }
    }

    void view(){
        System.out.println("available tickets "+no_of_tickets);
    }

    void cancel(int n){
        System.out.println("cancelling "+n+" Tickets");
        no_of_tickets+=n;
        System.out.println("tickets cancelled");
    }

    public static void main(String[] args) {
        ticket_counter t1=new ticket_counter(1001,100 );
        t1.view();
        t1.buy(20);
        t1.view();
        t1.cancel(10);
        t1.view();
    }
}
