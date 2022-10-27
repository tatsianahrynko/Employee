public class Employee {

    public String name, lastName;
    public int age;
    public double salary;
    public Location location;

    public Employee(String name, String lastName, int age, double salary, Location location) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee: " +
                name + " " + lastName +
                ", age: " + age +
                ", salary: " + salary +
                ", location: " + location;
    }

    void raiseSalary() {
        this.salary = this.salary + this.salary * 0.2;
    }

    void announceHighestSalary() {
        if (this.salary > 200000) {
            System.out.println("This employee earns a raised " + this.salary + " salary");
        }
    }
}

