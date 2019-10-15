public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Eduardo", "Marzano", 3000.00);
        Employee employee2 = new Employee("Ricardo", "Braga", 2400.00);
        Employee employee3 = new Employee("Anne", "Zimmermann", 2600.00);

        System.out.printf("%n%n *****  HR Definite Program  *****%n%n");
        System.out.printf("%s %s, monthly salary: $ %.2f, Annual salary: $ %.2f%n", employee1.getName(),
                employee1.getLastName(), employee1.getSalary(), employee1.getAnnualSalary(employee1.getSalary()));
        System.out.printf("%s %s, monthly salary: $ %.2f, Annual salary: $ %.2f%n", employee2.getName(),
                employee2.getLastName(), employee2.getSalary(), employee2.getAnnualSalary(employee2.getSalary()));
        System.out.printf("%s %s, monthly salary: $ %.2f, Annual salary: $ %.2f%n%n", employee3.getName(),
                employee3.getLastName(), employee3.getSalary(), employee3.getAnnualSalary(employee3.getSalary()));

        System.out.println("Salaries after 10% raise: ");
        employee1.setSalary(employee1.getSalaryRaised(employee1.getSalary()));
        employee2.setSalary(employee2.getSalaryRaised(employee2.getSalary()));
        employee3.setSalary(employee3.getSalaryRaised(employee3.getSalary()));
        System.out.printf("%n%s %s, Monthly salary: %.2f, Annual salary: %.2f%n", employee1.getName(),
                employee1.getLastName(),  employee1.getSalary(), employee1.getAnnualSalary(employee1.getSalary()));
        System.out.printf("%s %s, Monthly salary: %.2f, Annual salary: %.2f%n", employee2.getName(),
                employee2.getLastName(), employee2.getSalary(), employee2.getAnnualSalary(employee2.getSalary()));
        System.out.printf("%s %s, Monthly salary: %.2f, Annual salary: %.2f%n", employee3.getName(),
                employee3.getLastName(), employee3.getSalary(), employee3.getAnnualSalary(employee3.getSalary()));
    }
}
