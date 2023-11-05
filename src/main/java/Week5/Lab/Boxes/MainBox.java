package Week5.Lab.Boxes;

public class MainBox {
    public static void main(String[] args) {
        MaxWeightBox coffeeBox=new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo",5));
        coffeeBox.add(new Thing("prikka",5));
        coffeeBox.add(new Thing("Kopi Luwak",5));

        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("prikka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));

        OneThingBox box=new OneThingBox();
        box.add(new Thing("Saludo",5));
        box.add(new Thing("Pirkka",5));
        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));

        BlackHoleBox blackBox=new BlackHoleBox();
        blackBox.add(new Thing("Saludo", 5));
        blackBox.add(new Thing("Prikka",5));

        System.out.println(blackBox.isInTheBox(new Thing("Saludo")));
        System.out.println(blackBox.isInTheBox(new Thing("Prikka")));
    }
}
