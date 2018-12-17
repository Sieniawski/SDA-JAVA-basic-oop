package pl.bae.oop;

import pl.bae.oop.model.Employee;

public class EmployeeInfo {
    public void printInfo(Employee[] employees) {
        for (int i=0; i<employees.length; i++) {
            System.out.println("Imie: " + employees[i].getName() + ", Nazwisko: " + employees[i].getLastName() +
                    ", Wynagrodzenie: " + employees[i].getSalary() + "\nAdres." + " Ulica: " + employees[i].getStreet() +
                    ", Numer: " + employees[i].getNumber() + ", Miasto: " + employees[i].getCity() +
                    ", Kod pocztowy: " + employees[i].getPostalCode() + "\n");
        }
    }
}
