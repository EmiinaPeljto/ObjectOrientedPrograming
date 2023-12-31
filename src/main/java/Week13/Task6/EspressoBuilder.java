package Week13.Task6;

import java.util.ArrayList;
import java.util.List;

public class EspressoBuilder implements CoffeeBuilder{
    private Coffee coffee = new Coffee("Espresso", "", new ArrayList<>());

    @Override
    public void buildType() {
        coffee = new Coffee("Espresso", "", new ArrayList<>());
    }
    @Override
    public void buildSize() {
        coffee = new Coffee("Espresso", "M", new ArrayList<>());
    }
    @Override
    public void buildToppings() {
        coffee = new Coffee("Espresso", "M", List.of("Whipped cream"));
    }
    @Override
    public Coffee getResult() {
        return coffee;
    }
}
