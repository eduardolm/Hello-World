public class Employee {

    /** Variáveis de instância */
    private String name;
    private String lastName;
    private Double salary;

    public Employee(String name, String lastName, Double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary(Double salary) {
        if (salary < 0 )
            salary = null;
        return salary * 12;
    }

    public double getSalaryRaised(Double salary) {
        return salary * 1.1;
    }
}
