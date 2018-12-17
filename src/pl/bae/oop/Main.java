package pl.bae.oop;

import pl.bae.oop.model.Car;
import pl.bae.oop.model.Employee;
import pl.bae.oop.model.Student;

public class Main {

    public static void main(String[] args) {

        //String lancuch = "To jest tekst";
        //System.out.println(lancuch);
        Car bmw = new Car("BMW", "V8", 22323, 300);
        System.out.println("Model: " + bmw.getModel() + ", Engine: " + bmw.getEngine() + ", Price: " + bmw.getPrice() + ", Speed: " + bmw.getSpeed());

        Car mazda = new Car("Mazda", "RX", 232243, 344);
        System.out.println("Model: " + mazda.getModel() + ", Engine: " + mazda.getEngine() + ", Price: " + mazda.getPrice() + ", Speed: " + mazda.getSpeed());

        //ctrl+P informuje o wymaganych argumentach danej klasy
        Student student1 = new Student("Jan", "Kowalski", 22, mazda);
        Student student2 = new Student("Maciej", "Nowak", 21, mazda);

        System.out.println("Imie: " + student1.getName());
        student1.setName("Karol");
        System.out.println("Imie: " + student1.getName());

        System.out.println("Nazwisko: " + student2.getLastName());
        student2.setLastName("Lorem ipsum");
        System.out.println("Nazwisko: " + student2.getLastName());

        System.out.println("id: " + student2.getid());
        student2.setid(150);
        System.out.println("id: " + student2.getid());

        //tworzymy tablice 5ciu studentow
        Student[] students = new Student[5];

        students[0] = student1;
        students[1] = student2;
        students[2] = new Student("Ola", "Nowak",33, bmw);
        students[3] = new Student("Robert", "Kowacz",33, mazda);
        students[4] = new Student("Piotr", "Nowacki",33, bmw);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printInformation(students);

        Employee[] employees = new Employee[5];
        //stworzyc 5 pracownikow
        //klase EmployeeInfo
        //metode printInfo(Employee[] employee)
        //petla for

        employees[0] = new Employee("Poznan", "60300", "Dabrowskiego", "22", "Jan", "Kowalski", 1111);
        employees[1] = new Employee("Poznan", "60300", "Dabrowskiego", "22", "Jan", "Kowalski", 2222);
        employees[2] = new Employee("Poznan", "60300", "Dabrowskiego", "22", "Jan", "Kowalski", 3333);
        employees[3] = new Employee("Poznan", "60300", "Dabrowskiego", "22", "Jan", "Kowalski", 4444);
        employees[4] = new Employee("Poznan", "60300", "Dabrowskiego", "22", "Jan", "Kowalski", 5555);

        for (int j=0; j<employees.length; j++) {
            employees[j].raiseSalary(5);
        }

        EmployeeInfo emplo = new EmployeeInfo();
        emplo.printInfo(employees);




    }
}
