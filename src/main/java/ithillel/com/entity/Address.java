package ithillel.com.entity;

public class Address {
    private String country;
    private String state;
    private String city;
    private String zip;
    private String street;

    public Address(String country, String state, String city, String zip, String street) {
        this.country = country;
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return  "\n\tCountry - " + country +
                "\n\tState - " + state +
                "\n\tCity - " + city +
                "\n\tZip - " + zip +
                "\n\tStreet - " + street;
    }
}
