package Ex;

public class ex2 {
    public String name;
    public double gross_Salary = 6000;
    public double tax = 1000;
    public double increased_Salary;

    double calculatePercentage =  gross_Salary / (tax / 100);
    double salary = gross_Salary - tax;



    public void showSalary(){
        System.out.println("Employee : "+ name + "| R$"+ (gross_Salary - tax));
    }
    public void showPercentage(){

        increased_Salary = calculatePercentage + salary;

        System.out.println("which percentage to increase salary? R$"+increased_Salary);
    }
    public void showUpdated(){

        increased_Salary = calculatePercentage + salary;

        System.out.println("Updated : "+name +"  R$"+increased_Salary);
    }
}
