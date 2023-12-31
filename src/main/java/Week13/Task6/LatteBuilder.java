package Week13.Task6;

import java.util.ArrayList;
import java.util.List;

public class LatteBuilder implements CoffeeBuilder{
    private Coffee coffee = new Coffee("Latte", "", new ArrayList<>());

    @Override
    public void buildType() {
        coffee = new Coffee("Latte", "", new ArrayList<>());
    }
    @Override
    public void buildSize() {
        coffee = new Coffee("Latte", "L", new ArrayList<>());
    }
    @Override
    public void buildToppings() {
        coffee = new Coffee("Latte", "L", List.of("Mocha"));
    }
    @Override
    public Coffee getResult() {
        return coffee;
    }
}
