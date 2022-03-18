public class Area {
    protected int length;
    protected int breadth;
    protected int radius;
    protected int base;
    protected int height;
    protected double n;
     protected void area()
    {
        double pie=3.14;
        double cir=pie*radius*radius;
        System.out.println("Area of circle is "+cir);

    }

     protected void area( int length)
    {
        int sq=length*length;
        System.out.println("Area of Square is "+sq);

    }
    protected void  area( int length , int breadth)
    {
        int re=length*breadth;
        System.out.println("Area of rectangle is "+re);

    }
     protected void area( int base , int height,double n)
    {
        double rt=n*base*height;
        System.out.println("Area of rectangle is "+rt);

    }



}
