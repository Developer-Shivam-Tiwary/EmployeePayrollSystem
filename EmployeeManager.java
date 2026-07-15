import java.util.ArrayList;

public class EmployeeManager {

    // ArrayList to store all Employee objects
    private ArrayList<Employee> employeeList;

    // Constructor - initializes the ArrayList when EmployeeManager is created
    public EmployeeManager() {
        employeeList = new ArrayList<Employee>();
    }

    // Adds a new employee to the list
    public void addEmployee(Employee emp) {
        // Basic validation: check if an employee with the same ID already exists
        boolean idExists = false;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == emp.getId()) {
                idExists = true;
                break;
            }
        }

        if (idExists) {
            System.out.println("Employee ID " + emp.getId() + " already exists. Cannot add duplicate.");
        } else {
            employeeList.add(emp);
            System.out.println("Employee added successfully!");
        }
    
    }

    // Displays all employees currently stored
    public void viewAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("---- Employee List ----");
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }

    // Searches for an employee by ID and returns the Employee object if found
    public Employee searchEmployeeById(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                return emp; // found - return immediately
            }
        }
        return null; // not found
    }

    // Displays employee details for a given ID (used directly by the menu)
    public void displayEmployeeById(int id) {
        Employee emp = searchEmployeeById(id);

        if (emp == null) {
            System.out.println("Employee with ID " + id + " not found.");
        } else {
            System.out.println("Employee Found:");
            System.out.println(emp);
        }
    }

    // Updates an existing employee's department and basic salary
    public void updateEmployee(int id, String newDepartment, double newBasicSalary) {
        Employee emp = searchEmployeeById(id);

        if (emp == null) {
            System.out.println("Employee with ID " + id + " not found. Cannot update.");
        } else {
            emp.setDepartment(newDepartment);
            emp.setBasicSalary(newBasicSalary);
            System.out.println("Employee updated successfully!");
        }
    }

    // Deletes an employee by ID
    public void deleteEmployee(int id) {
        Employee emp = searchEmployeeById(id);

        if (emp == null) {
            System.out.println("Employee with ID " + id + " not found. Cannot delete.");
        } else {
            employeeList.remove(emp);
            System.out.println("Employee deleted successfully!");
        }
    }

}
