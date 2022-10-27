public class Main {


    public static void main(String[] args) {
        Employee employee1 = new Employee("Thomas", "Black", 45, 107000,Location.CA );
        Employee employee2 = new Employee("Anna", "Simpson", 24, 150000,Location.FL );
        Employee employee3 = new Employee("Gregory", "Williams", 36, 180000,Location.NY);
        Employee employee4 = new Employee("Taylor", "Wright", 34, 195000,Location.NV);
        Employee employee5 = new Employee("Bella", "Green", 30, 146000, Location.OR);

        System.out.println("BEFORE salary raise");
        System.out.println(" ");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);

        employee1.raiseSalary();
        employee2.raiseSalary();
        employee3.raiseSalary();
        employee4.raiseSalary();
        employee5.raiseSalary();

        System.out.println(" ");
        System.out.println("AFTER salary raise");
        System.out.println(" ");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);

        System.out.println(" ");

        System.out.println("highest salary");
        System.out.println(" ");

        employee1.announceHighestSalary();
        employee2.announceHighestSalary();
        employee3.announceHighestSalary();
        employee4.announceHighestSalary();
        employee5.announceHighestSalary();                                                                                                                                            /*System.out.println(employee1.announceHighestSalary());
                                                                                                                                                                  System.out.println(employee5.announceHighestSalary());*/
    }
}