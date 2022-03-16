public class Area {
    int length;
    int breadth;
    int radius;
    int base;
    int height;
    double n;
    void area()
    {
        double pie=3.14;
        double cir=pie*radius*radius;
        System.out.println("Area of circle is "+cir);

    }

    void area( int length)
    {
        int sq=length*length;
        System.out.println("Area of Square is"+sq);

    }
    void area( int length , int breadth)
    {
        int re=length*breadth;
        System.out.println("Area of rectangle is"+re);

    }
    void area( int base , int height,double n)
    {
        double rt=n*base*height;
        System.out.println("Area of rectangle is"+rt);

    }



}
