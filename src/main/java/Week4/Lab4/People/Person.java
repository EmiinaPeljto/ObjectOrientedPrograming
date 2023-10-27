package Week4.Lab4.People;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String nameSurname;
    private String address;
    private int age;
    private String country;

    public Person(String nameSurname, String address) {
        this.nameSurname = nameSurname;
        this.address = address;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString(){
        return String.valueOf(this.nameSurname+"\n"+this.address);
    }
}

class Student extends Person{
    private int credits;
    private int student_id;
    private ArrayList<Integer> grade=new ArrayList<>();

    public Student(String nameSurname, String address) {
        super(nameSurname, address);
        this.credits=0;

    }
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public List<Integer> getGrade() {
        return grade;
    }

    public void setGrade(List<Integer> grade) {

    }

    public void study(){
        credits++;
    }

    public void addGrade(int grade){
        if(grade>=1 && grade<=10){
            this.grade.add(grade);
        }
    }

    public void displayGrade(){
        for(int i:this.grade){
            System.out.println(i);
        }
    }
}

class Teacher extends Person{
    private int salary;
    public Teacher(String nameSurname, String address, int salary) {
        super(nameSurname, address);
        this.salary=salary;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return super.toString()+"\n"+"Salary "+String.valueOf(this.salary)+" euros/month";
    }
}

