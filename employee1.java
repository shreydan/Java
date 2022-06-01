import java.util.Scanner;

class Employee {

    int id;
    String name;
    String dept;
    int age;
    float salary;

}

class Company {

    Employee list[];
    int size;
    int numEmployees;
    Scanner obj = new Scanner(System.in);

    public Company(int size) {
        this.size = size;
        this.numEmployees = 0;
        list = new Employee[size];
    }

    public void newEmployee() {

        Employee emp = new Employee();
        numEmployees++;

        System.out.println("\n\nEnter employee details\n");
        obj.nextLine();
        emp.id = numEmployees;
        System.out.println("Enter name: ");
        emp.name = obj.nextLine();
        System.out.println("Enter department: ");
        emp.dept = obj.nextLine();
        System.out.println("Enter age: ");
        emp.age = obj.nextInt();
        System.out.println("Enter salary: ");
        emp.salary = obj.nextFloat();

        list[emp.id - 1] = emp;

    }

    public void listEmployees() {
        System.out.println("ID\tNAME\t\tDEPARTMENT\t\tAGE\tSALARY");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println(list[i].id + "\t"
                    + list[i].name + "\t\t"
                    + list[i].dept + "\t\t\t"
                    + list[i].age + "\t"
                    + list[i].salary);
        }
    }

    public static void main(String ar[]) {
        Company myCompany = new Company(5);
        System.out.println("Creating 5 employees:");
        for (int i = 0; i < 5; i++) {
            myCompany.newEmployee();
        }
        myCompany.listEmployees();
    }

}