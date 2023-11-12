package Week6.Lab6.Bird;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdWatchers birds = new BirdWatchers();

        while(true) {
            System.out.print("? ");
            String choice = reader.nextLine();

            switch (choice) {
                case "Add":
                    System.out.print("Name: ");
                    String nameOfBird = reader.nextLine();
                    System.out.print("Latin Name: ");
                    String latinNameOfBird = reader.nextLine();
                    birds.addBird(new Bird(nameOfBird, latinNameOfBird));

                    break;
                case "Observation":
                    System.out.print("What was observed:? ");
                    String observed = reader.nextLine();
                    birds.observation(observed);

                    break;
                case "Statistics":
                    birds.statistics();

                    break;
                case "Show":
                    System.out.print("What? ");
                    String what = reader.nextLine();
                    birds.show(what);

                    break;
            }

            if (choice.equals("Quit")) break;
        }
    }
}

