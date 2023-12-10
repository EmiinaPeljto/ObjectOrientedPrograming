package Week10.Lab.Task2;

import java.util.ArrayList;

public class GradeAnalyzer {
    public ArrayList<Integer> grades;

    public GradeAnalyzer(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double printSum(){
        double sum=0;
        for (int i:this.grades){
            sum+=i;
        }
        return sum;
    }
    public double calcAverage(){
        double sum=printSum();
        return (sum/this.grades.size());
    }
}
