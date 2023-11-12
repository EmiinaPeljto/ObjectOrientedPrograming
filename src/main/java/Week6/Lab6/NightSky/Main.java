package Week6.Lab6.NightSky;

public class Main {
    public static void main(String[] args) {
        NightSky nightSky = new NightSky(0.1, 40, 10);
        nightSky.printLine();

        NightSky nightSky1 = new NightSky(8, 4);
        nightSky1.print();
        System.out.println("Number of stars: " + nightSky1.starsInTheLastPrint());
        System.out.println();

        nightSky1.print();
        System.out.println("Number of stars: " + nightSky1.starsInTheLastPrint());
    }
}
