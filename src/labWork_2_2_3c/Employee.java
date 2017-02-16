package labWork_2_2_3c;

/**

 Write class Employee with method calcSalary with argument name(String) and varargs salary(double…).
 This method should calc total salary of employee and print his name and total salary.
 Write class Accountant that will be create Employee instance and use his method with a different number of data.


 */
public class Employee {
    public void calcSalary(String name, double...salary){
        System.out.print(name + ": ");
        double totalSalary = 0.0;
        for (double elem : salary){
            totalSalary+= elem;

        }
        System.out.println(totalSalary);
    }
}
