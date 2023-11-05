package Week5.Lab.Boxes;
import java.util.Objects;
public class Thing {
    private String name;
    private double weight;

    public double weight(){
        return this.weight;
    }

    public String getName(){
        return this.name;
    }

    public Thing(String name,double weight){
        if(this.weight<0){
            throw new IllegalArgumentException();
        }else{
            this.weight=weight;
        }
        this.name=name;
    }
    public Thing(String name){
        this.name=name;
    }

    public boolean equals(Object newThing){
        if(this==newThing) return true;
        if(newThing==null || this.getClass() !=newThing.getClass()) return false;
        Thing thing=(Thing) newThing;
        return Objects.equals(name,this.name);
    }

    public int hashCode(){
        return Objects.hash(name);
    }
}
