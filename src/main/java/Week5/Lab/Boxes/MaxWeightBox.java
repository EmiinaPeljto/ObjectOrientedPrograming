package Week5.Lab.Boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box{
    private int maxWeightBox;
    private int weightInBox;
    private ArrayList<Thing> things=new ArrayList<>();

    public MaxWeightBox(int maxWeightBox) {
        this.maxWeightBox = maxWeightBox;
        this.weightInBox=0;
    }

    @Override
    public void add(Thing thing) {
        if(this.weightInBox<this.maxWeightBox){
            this.weightInBox=this.weightInBox+(int)thing.weight();
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing t:things){
            if(t.getName().equals(thing.getName())){
                return true;
            }
        }
        return false;
    }
}
