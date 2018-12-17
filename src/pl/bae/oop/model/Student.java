package pl.bae.oop.model;

import pl.bae.oop.model.Car;

public class Student {

    //prywatne klasy
    private String name;
    private String lastName;
    private int id;

    private Car car; //przekazywanie obiektu przez kompozycje

    //konstruktor, przypisuje wartosci dostepne w obrebie klasy
    //można stworzyc konstruktor, get/set Code/Generate lub alt+insert bedac w klasie
    //wtyczka, ktora zrobi to za nas?
    public Student(String name, String lastName, int id, Car car) {
        //odbierana wartosc przypisujemy do wartosci pola
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.car = car;
    }
    //publiczne sa funkcje get/set
    //NAME
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    //lastName
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //id
    public int getid() {
        return this.id;
    }
    public void setid(int id){
        this.id = id;
    }
    //car
    public Car getCar() {
        return car;
    }





}
