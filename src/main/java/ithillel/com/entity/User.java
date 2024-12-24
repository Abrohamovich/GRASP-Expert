package ithillel.com.entity;

public class User {
    private String fullName; // John Doe
    private int age;
    private String sex; // M, F
    private Address address;

    public User(String fullName, int age, String sex) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n\tfullName - " + fullName +
                "\n\tage - " + age +
                "\n\tsex - " + sex;
    }
}
