package Week7.Lab.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

record Employee(int id,String name, double salary) {
}
class  EmployeeManagementSystem{
    private List<Employee> employeeList;

    public  EmployeeManagementSystem(){
        this.employeeList=new ArrayList<>();
    }

    public List<Employee> filterEmployeesBySalary(List<Employee> list,double min){
        return list.stream()
                .filter(employee -> employee.salary()>=min)
                .toList();
    }

    public double calculateTotalSalary(List<Employee> employees){
        return employees.stream()
                .mapToDouble(employee -> employee.salary())
                .sum();
    }

    public void displayEmployeeDetails(List<Employee> employees){
        employees.stream()
                .forEach(y-> System.out.println(y));
    }
}

class Main{
    public static void main(String[] args) {

        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();

        List<Employee> employees = List.of(
                new Employee(1, "Mujo", 50000.0),
                new Employee(2, "Suljo", 60000.0),
                new Employee(3, "Fata", 75000.0)
        );

        List<Employee> filteredEmployees = employeeManagementSystem.filterEmployeesBySalary(employees, 60000.0);
        System.out.println("Employees with minimum salary:");
        employeeManagementSystem.displayEmployeeDetails(filteredEmployees);
        System.out.println();
        double totalSalary = employeeManagementSystem.calculateTotalSalary(employees);
        System.out.println("Total salary of all employees: $" + totalSalary);
        System.out.println();

        System.out.println("Employee Details:");
        employeeManagementSystem.displayEmployeeDetails(employees);
    }
}


