package nontangible;

public class instagram {
    String username;
    String name;
    String password;
    final int id;
    static int num=1001;

    instagram(String username,String name, String password){
        this.id=num++;
        this.username=username;
        this.name=name;
        this.password=password;
    }

    void changeusername(String newuser,int days, String pass){
        if(days<=60){
            System.out.println("you can change username after 60 days");
            
        }
        else if(pass!=password){
            System.out.println("please enter the correct password");
        }
        else{
            System.out.println("changing username");
            username=newuser;
        }
    }

    void view(){
        System.out.println("Username: "+username);
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println();
    }

    public static void main(String[] args) {
        instagram u1=new instagram("mynk0404", "Mayank", "gunda");
        instagram u2=new instagram("kldpradhan", "Kuldeep", "bhalu");
        instagram u3=new instagram("saquib09", "Md. Saquib Imam", "jans");

        u1.changeusername("mayank0404", 62, "gunda");
        u1.view();
        u2.changeusername("kldp02", 62, "bhaluuu");
        u2.view();
        u3.changeusername("jansaquib", 31, "jans");
        u3.view();
    }
}
