package Week11;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
    @Test
    public void testifStudentisPresent(){
        StudentSystem system = new StudentSystem("students.csv");
        List<Student> students = system.getAllStudent();
        assertFalse(students.isEmpty(), "There should be at least one student in the file");
    }

    @Test
    public void testStudentWithId100() throws StudentNotFoundException{
        StudentSystem system = new StudentSystem("students.csv");
        try{
            assertFalse(system.getStudentById(100).isPresent(), "Student with ID 100 is present");
        }
        catch (StudentNotFoundException e){
            throw new StudentNotFoundException("Student could not be found");
        }
    }

    @Test
    public void testStudentNull(){
        StudentSystem system = new StudentSystem("students.csv");

        for(Student s : system.getAllStudent()){
            assertNotNull(s, "Student should not be null");
        }
    }

    @Test
    public void testHighestGPAStudent(){
        StudentSystem system = new StudentSystem("students.csv");
        assertNotNull(system.getHighestGPAStudent(), "There should be a student with the highest GPA");
    }

    @Test
    public void testExceptionForEmptyStudentList(){
        StudentSystem system = new StudentSystem("empty.txt");

        try{
            system.getAllStudent();
        }
        catch(EmptyStudentListException e){
            assertEquals(e.getMessage(), "List of students is empty.");
        }
    }

    @Test
    public void testNameArray(){
        StudentSystem system = new StudentSystem("students.csv");
        List<String> actualNames =

                system.getAllStudent().stream()
                        .map(student -> student.getName())
                        .limit(5)
                        .collect(Collectors.toList());

        List<String> expectedName = List.of("Camila Wood", "Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson");

        assertEquals(actualNames, expectedName, "First 5 names match.");
    }

    @Test
    public void testSize(){
        StudentSystem system = new StudentSystem("students.csv");

        List<Student> students= system.getAllStudent();

        assertEquals(70, students.size(), "The file has 70 students.");

    }

    @Test
    public void testLargestName(){
        StudentSystem system = new StudentSystem("students.csv");
        String expected = "Ana White";


        assertEquals(expected, system.getLongestNameStudent().getName(), "Two names are equal");

    }

    @Test
    public void testStudents(){
        StudentSystem system = new StudentSystem("students.csv");

        assertNotSame(system.getHighestGPAStudent(), system.getLongestNameStudent(), "Students should not be the same");
    }

    @Test
    public void testSameStudent() throws StudentNotFoundException{
        StudentSystem system = new StudentSystem("students.csv");
        try{
            assertNotSame(system.getHighestGPAStudent(), system.getStudentById(120), "Students should not be same");
        }
        catch (StudentNotFoundException e){
            throw new StudentNotFoundException("Student with ID 120 is not found");
        }

    }
}