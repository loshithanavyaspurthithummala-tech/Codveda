import java.util.ArrayList;
import java.util.Scanner;

// Employee Class
class Employee {
int id;
String name;
double salary;

Employee(int id, String name, double salary) {  
    this.id = id;  
    this.name = name;  
    this.salary = salary;  
}  

void display() {  
    System.out.println("ID: " + id + " | Name: " + name + " | Salary: " + salary);  
}

}

// Main Class
public class Main {

static ArrayList<Employee> employees = new ArrayList<>();  
static Scanner sc = new Scanner(System.in);  

public static void main(String[] args) {  

    while (true) {  
        System.out.println("\n===== EMPLOYEE MENU =====");  
        System.out.println("1. Add Employee");  
        System.out.println("2. View Employees");  
        System.out.println("3. Update Employee");  
        System.out.println("4. Delete Employee");  
        System.out.println("5. Exit");  
        System.out.print("Enter choice: ");  

        int choice = sc.nextInt();  

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
                System.out.println("Exited...");  
                return;  
            default:  
                System.out.println("Invalid choice!");  
        }  
    }  
}  

static void addEmployee() {  
    System.out.print("Enter ID: ");  
    int id = sc.nextInt();  

    sc.nextLine(); // buffer clear  

    System.out.print("Enter Name: ");  
    String name = sc.nextLine();  

    System.out.print("Enter Salary: ");  
    double salary = sc.nextDouble();  

    employees.add(new Employee(id, name, salary));  
    System.out.println("Employee Added!");  
}  

static void viewEmployees() {  
    if (employees.isEmpty()) {  
        System.out.println("No employees found!");  
        return;  
    }  

    for (Employee e : employees) {  
        e.display();  
    }  
}  

static void updateEmployee() {  
    System.out.print("Enter ID to update: ");  
    int id = sc.nextInt();  

    for (Employee e : employees) {  
        if (e.id == id) {  
            sc.nextLine();  
            System.out.print("Enter new name: ");  
            e.name = sc.nextLine();  

            System.out.print("Enter new salary: ");  
            e.salary = sc.nextDouble();  

            System.out.println("Updated successfully!");  
            return;  
        }  
    }  

    System.out.println("Employee not found!");  
}  

static void deleteEmployee() {  
    System.out.print("Enter ID to delete: ");  
    int id = sc.nextInt();  

    for (int i = 0; i < employees.size(); i++) {  
        if (employees.get(i).id == id) {  
            employees.remove(i);  
            System.out.println("Deleted successfully!");  
            return;  
        }  
    }  

    System.out.println("Employee not found!");  
}

}

