package nontangible;

public class swiggy {
    String name;
    String order;
    int quantity;
    boolean payment;


    swiggy(String name,String order,int quantity,boolean payment){
        this.name=name;
        this.order=order;
        this.quantity=quantity;
        this.payment=payment;
    }


    void view(){
        System.out.println("Name: "+name);
        System.out.println("Your order: "+order+" x"+quantity);
        if (payment) {
            System.out.println("food is being prepared");
            System.out.println();
        }
        else{
            System.out.println("complete the payment");
            System.out.println();
        }
        
    }

    // void placeorder(String order, int quantity,boolean p){
    //     if (p) {
    //         System.out.println("Order Placed! :)");
    //     }
    //     else{
    //         System.out.println("complete payment");
    //         order=null;
    //         quantity=0;
    //     }
    // }

    void cancel(String order){
        System.out.println("Order cancelled :(");
        order=null;
        quantity=0;
    }

    public static void main(String[] args) {
        swiggy u1=new swiggy("Mayank", "chole bhature", 4,true);
        // u1.placeorder("Chole Bhature", 4, true);
        u1.view();

        swiggy u2=new swiggy("Saquib", "Pizza-medium", 2, true);
        u2.view();
    }
}
