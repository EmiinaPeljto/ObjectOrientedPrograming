package Week10.Lab.Task3;

import java.io.IOException;

import static Week10.Lab.Task3.Events.generateEventsFile;
import static Week10.Lab.Task3.Events.readEventsFile;

public class main {
    public static void main(String[] args) throws IOException {
        String filename = "events.txt";

        generateEventsFile("events.txt");
        readEventsFile("events.txt");
    }
}
