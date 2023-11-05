package Week5.Lab.Second;

import java.util.ArrayList;

public class Box{
    private double maxWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things=new ArrayList<ToBeStored>();
    }

    public double totalWeight(){
        double total=0;
        for (ToBeStored t:this.things){
            total+=t.weight();
        }
        return total;
    }
    public void add(ToBeStored thing){
        if((maxWeight-totalWeight())>=thing.weight()){
            things.add(thing);
        }
    }
    public  String toString(){
        return "Box: "+things.size()+", total weight "+String.format("%.2f",totalWeight())+" kg";

    }


}
