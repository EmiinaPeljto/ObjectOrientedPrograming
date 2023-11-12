package Week6.Lab6.Bird;

import java.util.ArrayList;

class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public Bird (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservations() {
        this.observations++;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
}

class BirdWatchers {
    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird b) {
        birds.add(b);
    }

    public void observation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.setObservations();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void statistics() {
        for (Bird bird : birds.reversed()) {
            System.out.println(bird);
        }
    }

    public void show(String who) {
        for (Bird bird : birds) {
            if (bird.getName().equals(who)) {
                System.out.println(bird);
            }
        }
    }
}
