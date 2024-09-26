public class percentage {
    public static void main(String[] args) {
        int p=27, c=31, m=34, o=33;
        float percentage=0.0f;
        System.out.println("Student name is Anik Datta BULU");
        if (p<35 || c<35 || m<35 || o<35) {
            System.out.println("FAIL");
            if (m<35) {
                System.out.println("subject maths with marks "+m);
            }
            if (p<35) {
                System.out.println("subject physics with marks "+p);
            }
            if (c<35) {
                System.out.println("subject chemistry with marks "+c);
            }
            if (o<35) {
                System.out.println("subject optional with marks "+o);
            }
            
        }
        else{
            percentage= ((p+c+m+o)/4.0f);
        }

        System.out.println("percentage = " +percentage);
    }
}
