package Day2;

public class Employee {
    String name ;
    double salary;
    int hireYear ;
    public Employee (String n , double s , int h) {
        name = n ;
        salary = s ;
        hireYear = h ;
    }
    public double calSalary(){
        return salary * 12 ;
    }
    public  int calHire() {
        return 2024 - hireYear ;
    }



}
