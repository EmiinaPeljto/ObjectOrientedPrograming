package Week13.Task6;

import java.util.ArrayList;
import java.util.List;

public class CappuccinoBuilder implements CoffeeBuilder{
    private Coffee coffee = new Coffee("Cappuccino", "", new ArrayList<>());

    @Override
    public void buildType() {
        coffee = new Coffee("Cappuccino", "", new ArrayList<>());
    }
    @Override
    public void buildSize() {
        coffee = new Coffee("Cappuccino", "S", new ArrayList<>());
    }
    @Override
    public void buildToppings() {
        coffee = new Coffee("Cappuccino", "S", List.of("Whipped cream"));
    }
    @Override
    public Coffee getResult() {
        return coffee;
    }
}
