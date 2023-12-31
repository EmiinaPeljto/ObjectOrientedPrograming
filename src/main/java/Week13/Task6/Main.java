package Week13.Task6;

public class Main {
    public static void main(String[] args) {
        CoffeeDirector director = new CoffeeDirector();

        CoffeeBuilder espressoBuilder = new EspressoBuilder();
        CoffeeBuilder latteBuilder = new LatteBuilder();
        CoffeeBuilder cappuccinoBuilder = new CappuccinoBuilder();

        director.constructCoffee(espressoBuilder);
        Coffee espresso = espressoBuilder.getResult();
        System.out.println("Espresso: \n" + espresso + "\n");

        director.constructCoffee(latteBuilder);
        Coffee latte = latteBuilder.getResult();
        System.out.println("Latte: \n" + latte + "\n");

        director.constructCoffee(cappuccinoBuilder);
        Coffee cappuccino = cappuccinoBuilder.getResult();
        System.out.println("Cappuccino: \n" + cappuccino);

    }
}
