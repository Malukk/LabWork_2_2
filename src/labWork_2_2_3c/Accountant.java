package labWork_2_2_3c;

/**
 Write class Employee with method calcSalary with argument name(String) and varargs salary(double…).
 This method should calc total salary of employee and print his name and total salary.
 Write class Accountant that will be create Employee instance and use his method with a different number of data.
 */
public class Accountant {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.calcSalary("Peter");
        employee.calcSalary("Ivan", 200.5, 210.2, 199.9);
        employee.calcSalary("Alex", 100, 101, 102, 103, 104, 105, 106);
    }
}
