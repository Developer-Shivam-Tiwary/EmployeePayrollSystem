public class Employee {

    // Fields (data of the employee) - kept private for encapsulation
    private int id;
    private String name;
    private String department;
    private double basicSalary;

    // Constructor - used to create an Employee object with initial values
    public Employee(int id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    // Getters - allow other classes to READ the private data
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Setters - allow other classes to UPDATE the private data
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // toString() - defines how an Employee object looks when printed
    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Department: " + department +
               ", Basic Salary: " + basicSalary;
    }
}