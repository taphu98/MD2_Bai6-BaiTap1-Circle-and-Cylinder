public class Main {
    public static void main(String[] args) {
        System.out.println("-----CIRCLE-----");
        Circle circle = new Circle(5, "blue");
        System.out.println(circle);

        System.out.println("-----CYLINDER-----");
        Cylinder cylinder = new Cylinder(4, 6, "red");
        System.out.println(cylinder);
    }
}