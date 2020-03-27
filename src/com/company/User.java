package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User  {
    private String name;
    private String surname;
    private static int id = 0;
    private String username;
    private String password;
    private String address;
    private int internalPhoneNumber;
    private static int count = 0;


    public User(String name, String surname, String username, String password, String address, int internalPhoneNumber) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.address = address;
        this.internalPhoneNumber = internalPhoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getInternalPhoneNumber() {
        return this.internalPhoneNumber;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public static int getId() {
        return id;
    }

    public String getAddress() {
        return this.address;
    }

    public static User findUser(String username) {
        List <User> users = getUsers();
        System.out.println(users);
        for (User user : users) {
            if (user.getUsername().equals(username))
                return user;
        }
        return null;
    }

    public static User checkPassword(User user, String password) {
        if (user == null || password == null) {
            System.out.println("Password mismatch");
            return null;
        }
        if (user.getPassword().equals(password)) {
            System.out.println("Access granted");
            return user;
        }
        System.out.println("Password mismatch");
        return null;
    }

    public static List <User> getUsers() {
        Manager manager = new Manager("Anna", "Juno", "annaJ", "juno1234", "tallinn",988796875);
        Cashier cashier1 = new Cashier("Mari", "Thompson", "mariT", "thompson1234", "Moscow", 88678756);
        Cashier cashier2 = new Cashier("Jay", "Wilson", "jauW", "wilson1234", "Kirov",7976875);
        Cashier cashier3 = new Cashier("Mike", "Rile", "mikeR", "rile1234","Narva" ,98989768);
        Cashier cashier4 = new Cashier("Rubi", "Mils", "rubiM", "mils1234", "Washington",879687687);
        Cashier cashier5 = new Cashier("Tom", "Brine", "tomB", "brine1234", "Astana", 978768987);
        System.out.println(manager);
        return new ArrayList(Arrays.asList(cashier1, cashier2, cashier3, cashier4, cashier5, manager));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", internalPhoneNumber=").append(internalPhoneNumber);
        sb.append('}');
        return sb.toString();
    }
}
