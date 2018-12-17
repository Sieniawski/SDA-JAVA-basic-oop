package pl.bae.oop.model;

public class Employee extends Address {

    private String name;
    private String lastName;
    private double salary;

    public Employee(String city, String postalCode, String street, String number, String name, String lastName, double salary) {
        //klikajac 'super' +ctrl przenosimy sie do klasy Address
        super(city, postalCode, street, number);
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void raiseSalary(int i) {
        salary = salary + salary *i/100;
    }

/*
W klasie Employee stworzyć metodę raiseSalary(int i).
Metoda powinna podnieść salary o zadany procent.
Przyklad:
Employee emp = new Employee("Jan", "Kowalski", 4000); // + reszta parametrow
emp.rasieSalary(5);
Następnie wszystkim pracownikom podnieść pensje o 5%.
 */

}
