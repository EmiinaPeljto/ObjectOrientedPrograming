package Week4.Lecture.Ex2;

enum Color {
    BLACK, GREEN, WHITE
}
enum FuelType{
    DISEL,PETROL
}
class Vehicle {

    public Vehicle(){}
    private int numOfGGears;
    private int numOfWheels;
    private Color color;

    public Vehicle(int numOfGGears, int numOfWheels, Color color) {
        System.out.println("I'm a vehicle");
        this.numOfGGears = numOfGGears;
        this.numOfWheels=numOfWheels;
        this.color=color;
    }

    public int getNumOfGGears() {
        return numOfGGears;
    }

    public void setNumOfGGears(int numOfGGears) {
        this.numOfGGears = numOfGGears;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

class Car extends Vehicle{
    private FuelType fuelType;
    public Car(FuelType fuelType,int numOfGGears, int numOfWheels, Color color ){
        super(numOfGGears,numOfGGears,color);
        System.out.println("I'm Car");
        this.fuelType=fuelType;
    }
    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}

class Bicycle extends Vehicle{
    private boolean doseItHaveDinama;

    public Bicycle(boolean doseItHaveDinama,int numOfGGears, int numOfWheels, Color color){
        super(numOfWheels,numOfGGears,color);
        System.out.println("I'm bicycle");
        this.doseItHaveDinama=doseItHaveDinama;
    }

    public boolean isDoseItHaveDinama() {
        return doseItHaveDinama;
    }

    public void setDoseItHaveDinama(boolean doseItHaveDinama) {
        this.doseItHaveDinama = doseItHaveDinama;
    }

    public static void main(String[] args) {
        Bicycle bike=new Bicycle(false,21,2,Color.BLACK);
        Car car=new Car(FuelType.DISEL,5,4,Color.WHITE);
        Vehicle vehicle=new Vehicle();
    }
}



