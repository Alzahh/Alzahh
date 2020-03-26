package com.company;

public class Cashier extends User {
    private String name;
    private String surname;
    private String username;
    private String password;
    private String address;
    private int internalPhoneNumber;

    public Cashier(String name, String surname, String username, String password, String address, int internalPhoneNumber) {
        super(name,surname,username,password,address, internalPhoneNumber);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public int getInternalPhoneNumber() {
        return internalPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "name='" + this.name + '\'' +
                ", surname='" + this.surname + '\'' +
                ", username='" + this.username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", internalPhoneNumber=" + internalPhoneNumber +
                '}';
    }
}
