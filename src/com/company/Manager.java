package com.company;

public class Manager extends User {

    public Manager(String name, String surname, String username, String password, String address, int internalPhoneNumber) {
        super(name, surname, username, password, address, internalPhoneNumber);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public int getInternalPhoneNumber() {
        return super.getInternalPhoneNumber();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public String toString() {
        return "Manager{} " + super.toString();
    }
}
