package Week5.Lab.Boxes;

import java.util.ArrayList;

public class OneThingBox extends Box{
    private ArrayList<Thing>things=new ArrayList<>();
    private int addition;
    public OneThingBox(){}

    @Override
    public void add(Thing thing) {
        if(this.things.size()==0){
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
