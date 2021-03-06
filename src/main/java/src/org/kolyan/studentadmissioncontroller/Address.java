package src.org.kolyan.studentadmissioncontroller;

import org.hibernate.validator.constraints.Range;

public class Address {

    private String country;
    private String city;
    private String street;

    @Range(min = 1, max = 10)
    private int pincode;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
