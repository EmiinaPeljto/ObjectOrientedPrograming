package Week4.Lab4.People;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

    public static void printDepartment(List<Person> people){;
        for(Person p:people){
            System.out.println(p);
        }
    }


    public static void main(String[] args) {
        Teacher pekka=new Teacher("Pekka Mikkola","Korsontie Street 1 03100 Vantaa",1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki",5400);
        System.out.println(esko);
        System.out.println(pekka);

        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        olli.addGrade(5);
        olli.addGrade(6);
        olli.addGrade(5);
        olli.displayGrade();

        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli );
        System.out.println("credits "+olli.getCredits());
        System.out.println();

        List<Person> people=new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);
    }
    }





