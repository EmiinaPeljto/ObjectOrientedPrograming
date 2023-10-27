package Week4.Lab4.Shape;

public class Main4_2 {
    public static void main(String[] args) {
        Shape c=new Shape("black",FillType.NOT_FILLED);
        Circle cc=new Circle("red",FillType.FILLED,2);
        Rectangle r=new Rectangle("ping",FillType.NOT_FILLED,2,6);
        System.out.println(cc.calculateCircumference());
        System.out.println(c.displayInfo());
        System.out.println(cc.getArea());
        System.out.println(r.displayInfo());
        System.out.println(r.getArea());
    }
}
