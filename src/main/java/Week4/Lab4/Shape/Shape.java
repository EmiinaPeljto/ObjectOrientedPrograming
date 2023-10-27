package Week4.Lab4.Shape;

class Shape {
    private String color;
    private FillType fillType;

    public Shape(String color,FillType fillType){
        this.color=color;
        this.fillType=fillType;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public FillType getFillType() {
        return fillType;
    }
    public void setFillType(FillType fillType) {
        this.fillType = fillType;
    }

    public double getArea(){
        return 0;
    }
    public String displayInfo(){
        return String.valueOf(this.color+" "+this.fillType);
    }
}

class Circle extends Shape{
    private double radius;
    public Circle(String color, FillType fillType,int radius) {
        super(color, fillType);
        this.radius=radius;
    }
    @Override
    public String displayInfo(){
        return super.displayInfo()+" "+ String.valueOf(this.radius);
    }
    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double calculateCircumference(double PI){
        return 2*PI*this.radius;
    }

    public double calculateCircumference(){
        return 2*Math.PI*this.radius;
    }
}

class Rectangle extends Shape{

    private double width;
    private double height;
    public Rectangle(String color, FillType fillType, double height,double width){
        super(color,fillType);
        this.width=width;
        this.height=height;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo()+String.valueOf(this.height+" "+this.width);
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }
}