public class My {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.radius = 5;
        System.out.println("area of circle is");
        obj.area();
        System.out.println("area of square is");

        obj.area(5);
        System.out.println("area of rectangle is");
        obj.area(6, 6);


    }
}