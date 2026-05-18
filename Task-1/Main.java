Main.java

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
int id;
String name;
double salary;

Employee(int id, String name, double salary) {  
    this.id = id;  
    this.name = name;  
    this.salary = salary;  
}  

void show() {  
    System.out.println("--------------------------------");  
    System.out.println("ID     : " + id);  
    System.out.println("Name   : " + name);  
    System.out.println("Salary : " + salary);  
    System.out.println("--------------------------------");  
}

}

public class Main {

static ArrayList<Employee> list = new ArrayList<>();  
static Scanner sc = new Scanner(System.in);  

public static void main(String[] args) {  

    int choice;  

    do {  
        System.out.println("\n========= EMPLOYEE SYSTEM =========");  
        System.out.println("1. Add Employee");  
        System.out.println("2. View Employees");  
        System.out.println("3. Update Employee");  
        System.out.println("4. Delete Employee");  
        System.out.println("5. Exit");  
        System.out.print("Enter choice: ");  

        choice = sc.nextInt();  

        switch (choice) {  
            case 1:  
                addEmployee();  
                break;  
            case 2:  
                viewEmployees();  
                break;  
            case 3:  
                updateEmployee();  
                break;  
            case 4:  
                deleteEmployee();  
                break;  
            case 5:  
                System.out.println("Exiting... Bye 👋");  
                break;  
            default:  
                System.out.println("Invalid choice!");  
        }  

    } while (choice != 5);  
}  

static void addEmployee() {  
    System.out.print("Enter ID: ");  
    int id = sc.nextInt();  

    sc.nextLine();  

    System.out.print("Enter Name: ");  
    String name = sc.nextLine();  

    System.out.print("Enter Salary: ");  
    double salary = sc.nextDouble();  

    list.add(new Employee(id, name, salary));  
    System.out.println("Employee added ✔️");  
}  

static void viewEmployees() {  
    if (list.isEmpty()) {  
        System.out.println("No employees found ❌");  
        return;  
    }  

    for (Employee e : list) {  
        e.show();  
    }  
}  

static void updateEmployee() {  
    System.out.print("Enter ID: ");  
    int id = sc.nextInt();  

    for (Employee e : list) {  
        if (e.id == id) {  
            sc.nextLine();  

            System.out.print("New Name: ");  
            e.name = sc.nextLine();  

            System.out.print("New Salary: ");  
            e.salary = sc.nextDouble();  

            System.out.println("Updated ✔️");  
            return;  
        }  
    }  

    System.out.println("Not found ❌");  
}  

static void deleteEmployee() {  
    System.out.print("Enter ID: ");  
    int id = sc.nextInt();  

    for (int i = 0; i < list.size(); i++) {  
        if (list.get(i).id == id) {  
            list.remove(i);  
            System.out.println("Deleted ✔️");  
            return;  
        }  
    }  

    System.out.println("Employee Not found ❌");  
}

}
