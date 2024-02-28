package entities;

public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee(java.lang.String name, java.lang.Double salary) {
        this.name = name;
        salary = salary;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.Double getSalary() {
        return salary;
    }

    public void setSalary(java.lang.Double salary) {
        salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }
}
