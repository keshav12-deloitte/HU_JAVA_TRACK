public class Animals {
    private int a;
    private String b;
    private int c;


    public void seta(int a1) {
        int a = a1 ;
        this.a = a1;
    }

    public int geta() {
        return a;
    }

    public void setb(String b1) {
        String b = b1;
        this.b = b1;
    }

    public String getb() {
        return b;
    }

    public void setc(int c1) {
        int c =c1;
        this.c = c1;
    }

    public int getc() {
        return c;
    }
    public static void main(String[] args) {
        Animals obj2 = new Animals();
        obj2.seta(101);
        obj2.setb("Keshav");
        obj2.setc(18);
        System.out.println(obj2.geta()+" "+obj2.getb()+" "+obj2.getc());
    }
}