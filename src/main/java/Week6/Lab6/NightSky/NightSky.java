package Week6.Lab6.NightSky;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInTheLastParint;

    public NightSky(double density){
        this.density=density;
        this.width=20;
        this.height=10;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density=0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;

    }

    public void printLine(){
        this.starsInTheLastParint=0;
        Random random=new Random();
        for (int i=0;i<this.width;i++){
            if(random.nextDouble()<=this.density){
                System.out.print("*");
                this.starsInTheLastParint++;
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void print(){
        int totalStarts=0;
        for(int i=0;i<this.height;i++){
            printLine();
            totalStarts+=this.starsInTheLastParint;
        }
        this.starsInTheLastParint=totalStarts;
    }
    public int starsInTheLastPrint(){
        return this.starsInTheLastParint;
    }
}
