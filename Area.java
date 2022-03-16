public class Area {
    int length;
    int breadth;
    int radius;
    int base;
    int height;
    void area()
    {
        double pie=3.14;
        double cir=pie*radius*radius;
        System.out.println(cir);

    }

    void area( int length)
    {
        int sq=length*length;
        System.out.println(sq);

    }
    void area( int length , int breadth)
    {
        int re=length*breadth;
        System.out.println(re);

    }


}
