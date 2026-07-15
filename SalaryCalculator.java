public class SalaryCalculator {

    // Fixed percentage rates used in salary calculation
    private static final double HRA_PERCENT = 0.20;
    private static final double DA_PERCENT = 0.10;
    private static final double BONUS_PERCENT = 0.05;
    private static final double TAX_PERCENT = 0.05;
    private static final double PF_PERCENT = 0.08;

    // Calculates HRA based on basic salary
    public double calculateHRA(Employee emp) {
        return emp.getBasicSalary() * HRA_PERCENT;
    }

    // Calculates DA based on basic salary
    public double calculateDA(Employee emp) {
        return emp.getBasicSalary() * DA_PERCENT;
    }

    // Calculates Bonus based on basic salary
    public double calculateBonus(Employee emp) {
        return emp.getBasicSalary() * BONUS_PERCENT;
    }

    // Calculates Gross Salary = Basic + HRA + DA + Bonus
    public double calculateGrossSalary(Employee emp) {
        return emp.getBasicSalary() + calculateHRA(emp) + calculateDA(emp) + calculateBonus(emp);
    }

    // Calculates Tax based on Gross Salary
    public double calculateTax(Employee emp) {
        return calculateGrossSalary(emp) * TAX_PERCENT;
    }

    // Calculates PF based on Gross Salary
    public double calculatePF(Employee emp) {
        return calculateGrossSalary(emp) * PF_PERCENT;
    }

    // Calculates Net Salary = Gross Salary - Tax - PF
    public double calculateNetSalary(Employee emp) {
        return calculateGrossSalary(emp) - calculateTax(emp) - calculatePF(emp);
    }

    // Generates and prints a formatted salary slip for the given employee
    public void generateSalarySlip(Employee emp) {
        System.out.println("==========================================");
        System.out.println("              SALARY SLIP                ");
        System.out.println("==========================================");
        System.out.println("Employee ID   : " + emp.getId());
        System.out.println("Name          : " + emp.getName());
        System.out.println("Department    : " + emp.getDepartment());
        System.out.println("------------------------------------------");
        System.out.printf("Basic Salary  : %.2f%n", emp.getBasicSalary());
        System.out.printf("HRA (20%%)     : %.2f%n", calculateHRA(emp));
        System.out.printf("DA (10%%)      : %.2f%n", calculateDA(emp));
        System.out.printf("Bonus (5%%)    : %.2f%n", calculateBonus(emp));
        System.out.printf("Gross Salary  : %.2f%n", calculateGrossSalary(emp));
        System.out.println("------------------------------------------");
        System.out.printf("Tax (5%%)      : %.2f%n", calculateTax(emp));
        System.out.printf("PF (8%%)       : %.2f%n", calculatePF(emp));
        System.out.println("------------------------------------------");
        System.out.printf("NET SALARY    : %.2f%n", calculateNetSalary(emp));
        System.out.println("==========================================");
    }
}