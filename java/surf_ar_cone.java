public class surf_ar_cone {

public static void surf_ar(double r, double h){
    System.out.println("surface area of cone is = "+(3.14*r*(r+(Math.sqrt((h*h)+(r*r))))));
}

    public static void main(String[] args) {
        surf_ar(5.0,6);
    }
}
