public class Laptop {
   
    static int num=10001;
    
    final String id;
    int year;
    String brandname;
    String modelname;
    double price;
    public Laptop(String brandname, int year, double price,String modelname) {
        this.id= year + brandname + num++;
        this.year=year;
        this.modelname=modelname;
        this.price = price;
        
    }

    void details(){
        
        System.out.println("Model: "+modelname);
        System.out.println("ID: LAP"+id);
        System.out.println("Price: "+price);
        System.out.println();
    }

    public static void main(String[] args) {
        Laptop l1= new Laptop("DELL",2023, 52000.00,"Pavillion 360");
        Laptop l2= new Laptop("ASUS", 2022, 55000.00, "ROG strix g15");
        Laptop l3= new Laptop("APPLE", 2024, 60000.00, "MAC BOOK AIR 2");
        l1.details();
        l2.details();
        l3.details();
    }
     
}
