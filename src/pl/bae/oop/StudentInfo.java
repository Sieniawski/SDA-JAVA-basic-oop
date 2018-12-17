package pl.bae.oop;

import pl.bae.oop.model.Student;

public class StudentInfo {
                            //typ i wartosc po ktorej szukamy
    public void printInformation(Student[] students) {
        for(int i=0; i<students.length; i++){                      //po wybraniu klasy mozemy po '.' dostac sie do jej parametrow
            System.out.println("Imie: " + students[i].getName() + ", Samochod: " + students[i].getCar().getModel());
        }
    }
}
