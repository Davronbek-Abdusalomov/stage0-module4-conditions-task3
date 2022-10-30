package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary<=10000){
            double taxes = salary*1.5;
        }
        else if (10000 < salary && salary <= 20000){
            double taxes = salary*1.8;
        }
        else if (salary>20000){
            double taxes = salary * 2.0;
        }
    }
}
