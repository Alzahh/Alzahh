package com.company;

import java.util.List;

public class Manager extends User {
    private String name;
    private String surname;
    private String username;
    private String password;
    private String address;
    private int internalPhoneNumber;

    public Manager(String name, String surname, String username, String password,String address, int internalPhoneNumber) {
        super(name,surname,username,password,address,internalPhoneNumber);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public int getInternalPhoneNumber() {
        return internalPhoneNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + this.name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", internalPhoneNumber=" + internalPhoneNumber +
                '}';
    }
}
