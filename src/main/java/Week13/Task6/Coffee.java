package Week13.Task6;

import java.util.List;

public class Coffee {
    private String type;
    private String size;
    private List<String> toppings;

    public Coffee(String type, String size, List<String> toppings) {
        this.type = type;
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Type: " + this.type + "\nSize: " + this.size + "\nToppings: " + this.toppings;
    }
}
