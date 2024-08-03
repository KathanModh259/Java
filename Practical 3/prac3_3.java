
import java.util.Scanner;

public class prac3_3 {
    class Employee {
        String fname;
        String lname;
        double salary;

        // public Employee(String fname, String lname, double salary) {
        // this.fname = fname;
        // this.lname = lname;
        // this.salary = salary;
        // }

        // public String getFname() {
        // return fname;
        // }

        // public void setFname(String fname) {
        // this.fname = fname;
        // }

        // public String getLname() {
        // return lname;
        // }

        // public void setLname(String lname) {
        // this.lname = lname;
        // }

        // public double getSalary() {
        // return salary;
        // }

        // public void setSalary(double salary) {
        // this.salary = salary;
        // }

        double year_sal;

        int year_salary() {

            year_sal = salary * 12;
            System.out.println("The yearly salary of the employee is " + year_sal);
            return 0;

        }

        int TestEmployee() {

            double increment = year_sal + (year_sal * 0.1);
            System.out.println("The increment in the salary is " + increment);
            return 0;

        }

        int getdata() {
            System.out.println("Enter the details of employee");
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the first name of the employee");
                fname = sc.nextLine();
                System.out.println("Enter the last name of the employee");
                lname = sc.nextLine();
                System.out.println("enter the salary of the employee");
                salary = sc.nextDouble();
            }
            return 0;

        }

        int putdata() {
            System.out.println("-------------Details of the employee-------------");
            System.out.println("The name of the employee is " + fname + lname + " with salary" + salary + " per month");
            year_salary();
            TestEmployee();
            return 0;

        }
    }

    public static void main(String[] args) {
        Employee e1 = new prac3_3().new Employee();
        e1.getdata();
        e1.putdata();

        System.out.println("This Practical is made by 23CS046-Kathan Modh");

    }

}
