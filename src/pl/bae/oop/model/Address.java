package pl.bae.oop.model;

//dziedziczenie dostep z jednej klasy do drugiej
public class Address {

    private String city;
    private String postalCode;
    private String street;
    private String number;

    public Address(String city, String postalCode, String street, String number) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
