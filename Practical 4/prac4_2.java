
public class prac4_2 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("---------------The Employee Details------------\n" + e1.name + "\nAge:" + e1.age
                + "\nMobile Number:" + e1.number + "\nAddress:" + e1.address);
        e1.print_salary();
        e1.specialization();
        Manager m1 = new Manager();
        System.out.println("---------------The Manager Details------------\n" + e1.name + "\nAge:" + e1.age
                + "\nMobile Number:" + e1.number + "\nAddress:" + e1.address);
        m1.print_salary();
        m1.department();
    }

}

class Member {
    String name = "Kathan";
    int age = 22;
    long number = 9824992365L;
    String address = "Home,Ahmedabad";
    double salary = 500000;

    public void print_salary() {
        System.out.println("The salary of member is" + salary);
    }
}

class Employee extends Member {
    String special = "Tech";

    public void specialization() {
        System.out.println("Specialized in " + special);
    }

}

class Manager extends Member {
    String depart = "CSE";

    public void department() {
        System.out.println("In the department" + depart);
    }
}
