import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();
        SalaryCalculator calculator = new SalaryCalculator();

        boolean running = true;

        while (running) {
            System.out.println("\n==== Employee Payroll Management System ====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Calculate Salary");
            System.out.println("7. Generate Salary Slip");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 8.");
                continue; // skip this loop iteration, show menu again
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Basic Salary: ");
                    double basicSalary = Double.parseDouble(scanner.nextLine().trim());

                    Employee newEmp = new Employee(id, name, department, basicSalary);
                    manager.addEmployee(newEmp);
                    break;

                case 2:
                    manager.viewAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = Integer.parseInt(scanner.nextLine().trim());
                    manager.displayEmployeeById(searchId);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = Integer.parseInt(scanner.nextLine().trim());
                    System.out.print("Enter New Department: ");
                    String newDept = scanner.nextLine();
                    System.out.print("Enter New Basic Salary: ");
                    double newSalary = Double.parseDouble(scanner.nextLine().trim());
                    manager.updateEmployee(updateId, newDept, newSalary);
                    break;

                case 5:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = Integer.parseInt(scanner.nextLine().trim());
                    manager.deleteEmployee(deleteId);
                    break;

                case 6:
                    System.out.print("Enter Employee ID to calculate salary: ");
                    int calcId = Integer.parseInt(scanner.nextLine().trim());
                    Employee calcEmp = manager.searchEmployeeById(calcId);

                    if (calcEmp == null) {
                        System.out.println("Employee not found.");
                    } else {
                        System.out.println("Gross Salary: " + calculator.calculateGrossSalary(calcEmp));
                        System.out.println("Net Salary: " + calculator.calculateNetSalary(calcEmp));
                    }
                    break;

                case 7:
                    System.out.print("Enter Employee ID to generate salary slip: ");
                    int slipId = Integer.parseInt(scanner.nextLine().trim());
                    Employee slipEmp = manager.searchEmployeeById(slipId);

                    if (slipEmp == null) {
                        System.out.println("Employee not found.");
                    } else {
                        calculator.generateSalarySlip(slipEmp);
                    }
                    break;

                case 8:
                    System.out.println("Exiting... Thank you!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 1 and 8.");
            }
        }

        scanner.close();
    }
}