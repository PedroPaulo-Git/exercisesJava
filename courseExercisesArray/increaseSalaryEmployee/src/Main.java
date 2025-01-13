import entities.Employee;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> Employees = new ArrayList<>();
        System.out.println("How many employee ? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0;i < n;i++){
            System.out.println();
            System.out.println("Employee #" + i + ": ");
            System.out.print("Enter a New Employee id : ");
            int id = sc.nextInt();
            System.out.print("Enter a New Employee name : ");
            String name = sc.next();
            System.out.print("Enter a New Employee Salary : ");
            double salary = sc.nextInt();
           // System.out.println(Employee.getId());
            Employees.add(new Employee(id,name,salary));
//            newEmployee.setId(id);
//            newEmployee.setName(name);
//            newEmployee.setSalary(salary);
//            System.out.println("Employee ("+i+") : "+newEmployee);

        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee EmployeeGetIdFilter = Employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
        if (EmployeeGetIdFilter == null){
            System.out.print("Don't Exist a Employee with this ID");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percentage  = sc.nextDouble();
            EmployeeGetIdFilter.increaseSalaryEmployee(percentage);
        }

        System.out.println("Employee List :");
        for (Employee obj :Employees){
            System.out.println(obj);
        }


        sc.close();
    }
}