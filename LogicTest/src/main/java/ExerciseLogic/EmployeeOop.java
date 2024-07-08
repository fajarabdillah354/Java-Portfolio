package ExerciseLogic;


import java.util.ArrayList;
import java.util.List;

abstract class Employee{

    //encappulation kita bisa mengubah identifiernya menjadi private lalu menggunakan getter setter
    protected String name;
    protected int id;
    protected double basesalary;

    public Employee(String name, int id, double basesalary) {
        this.name = name;
        this.id = id;
        this.basesalary = basesalary;
    }

    abstract double calculateSalary();

    @Override
    public String toString() {
        return "name = " + name + ",\n id = " + id + ",\n basesalary = " + calculateSalary() ;
    }


}

class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double basesalary, double bonus) {
        super(name, id, basesalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basesalary+bonus;
    }

    @Override
    public String toString() {
        return "Manager : \n" +super.toString() + ", bonus=" + bonus ;
    }
}

class Developer extends Employee{

    private int overtimeHoursinMonth;
    private int hourlyRate;

    public Developer(String name, int id, double basesalary, int overtimeHoursinMonth, int hourlyRate) {
        super(name, id, basesalary);
        this.overtimeHoursinMonth = overtimeHoursinMonth;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return basesalary + (overtimeHoursinMonth*hourlyRate);
    }


    @Override
    public String toString() {
        return "Developer : \n" + super.toString() + ", OvertimeHours=" + overtimeHoursinMonth ;
    }
}

public class EmployeeOop {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager("fajar abdillah ahmad",1,4000, 5000));
        employees.add(new Developer("nafal",2, 5000, 1000,50));


        for (var emp : employees) {
            System.out.println(emp);
        }

        double totalSalary = employees.stream().mapToDouble(Employee::calculateSalary).sum();
        System.out.println("\n Total salary of all Employees : $ "+totalSalary);
    }



}
