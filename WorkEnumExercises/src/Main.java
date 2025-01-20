import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Department:");
        String DepartmentName = sc.next();
        Department department = new Department(DepartmentName);
        System.out.println("Enter worker data : ");
        System.out.println("name:");
        String workerName = sc.next();
        System.out.println("level:");
        String level = sc.next();
        System.out.println("base salary:");
        double workerBS = sc.nextDouble();
        System.out.println("how many contracts? :");
        int contracts = sc.nextInt();
        Worker worker = new Worker(workerName,WorkerLevel.valueOf(level),workerBS,department);
        System.out.println(worker);
        double incomeSalary = 0;

        for (int i = 0;i < contracts;i++){
//            contracts += sc.nextInt();
            System.out.println("DATE :");
            String dateAPI = sc.next();

            System.out.println(dateAPI);
            DateTimeFormatter formater1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dateAPI, formater1);

            // Convert LocalDate to Date
            Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            System.out.println("value per hour :");
            double valueperhour = sc.nextDouble();
            System.out.println("duration :");
            int hour = sc.nextInt();
            HourContract contract = new HourContract(date,valueperhour,hour);
            worker.addContract(contract);
            System.out.println(contract);
        }
        List<HourContract> contractsLocal = worker.getContracts();
//        for (HourContract i : contractsLocal){
            System.out.println("month to calculate (MM/YYYY):" );
            System.out.println("name: "+ worker.getName());
            String monthAndYear = sc.next();
            int month = Integer.parseInt(monthAndYear.substring(0, 2));
            int year = Integer.parseInt(monthAndYear.substring(3));
            System.out.println("department : "+department.getName());
            System.out.println("income for "+ worker.incomeSalary(month,year));

      //  }
        sc.close();
    }
}