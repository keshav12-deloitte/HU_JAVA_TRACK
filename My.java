public class My extends Area {
    public static void main(String[] args) {
       My obj = new My();
       obj.radius=5;
       obj.area();
       obj.area(5);
       obj.area(6,6);
       obj.area(5,6,0.5);
    }
}
