package nontangible;

public class fc {
    String username;
    final int id;
    static int num=1101;
    int ovr;

    public fc(String username, int ovr) {
        this.username = username;
        this.id = num++;
        this.ovr = ovr;
    }

    void upgrade(int marsc,int plrlevel){
        switch(plrlevel){
           case 1 : if(marsc>=1){
                        System.out.println("upgrade complete");
                        plrlevel++;
            }
            else{
                System.out.println("can't upgrade");
            }
            break;

            case 2 : if (marsc>=2) {
                System.out.println("upgrade complete");
                        plrlevel++;
            }
            else{
                System.out.println("can't upgrade");
            }
            break;
            case 3 : if (marsc>=4) {
                System.out.println("upgrade complete");
                        plrlevel++;
            }
            else{
                System.out.println("can't upgrade");
            }
            break;
            case 4 : if (marsc>=8) {
                System.out.println("upgrade complete");
                        plrlevel++;
            }
            else{
                System.out.println("can't upgrade");
            }
            break;
            case 5 : if (marsc>=16) {
                System.out.println("upgrade complete");
                        plrlevel++;
                        ovr++;
            }
            else{
                System.out.println("can't upgrade");
            }
            break;
            default:System.out.println("fully upgraded");

        }


    }

    void streak(int count){
        if(count>=0){
            System.out.println("daily reward recieved for "+count+" consecutive days");
            count++;
        }
        else{
            count=0;
        }
    }
    void view(){
        System.out.println("Username: "+username);
        System.out.println("Team overall: "+ovr);
        System.out.println();
    }

    public static void main(String[] args) {
        fc u1=new fc("mynk0404",  98);
        u1.view();
        u1.upgrade(20, 5);
        u1.view();
    }
    
}
