package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary<=10000){
            salary = (int) (salary-salary*0.15);
        }
        else if (10000 < salary && salary <= 20000){
            salary = (int) (salary-salary*0.18);
        }
        else if (salary>20000){
            salary = (int) (salary-salary*0.12);
        }
        else if (salary<0){
            System.out.println("wrong input!");
        }
    }
}
