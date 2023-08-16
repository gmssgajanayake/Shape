public class TestShape {
    public static void main(String[] args) {
        Circle c1=new Circle(7,"Green");
        Rectangle r1=new Rectangle();
        Square s1=new Square(3);

        System.out.println(c1.toString());
        System.out.println();
        System.out.println(r1.toString());
        System.out.println();
        System.out.println(s1.toString());
    }
}
