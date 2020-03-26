package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void printMenu(String locale) {
        if (locale.equals("en")) {
            System.out.println("Please, choose option: ");
            System.out.println("1) New Basket " +
                    "\n2) Insert item in basket " +
                    "\n3) Remove item from basket " +
                    "\n4) Print information for basket with a certain ID " +
                    "\n5) Apply discount to basket with 10% for Christmas promotion " +
                    "\n6) Exit ");
        } else if (locale.equals("ru")) {
            System.out.println("Please, choose option: ");
            System.out.println("1) New Basket " +
                    "\n2) Insert item in basket " +
                    "\n3) Remove item from basket " +
                    "\n4) Print information for basket with a certain ID " +
                    "\n5) Apply discount to basket with 10% for Christmas promotion " +
                    "\n6) Exit ");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Please, enter your username: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String usernameAnswer = reader.readLine();
        User user = User.findUser(usernameAnswer);
        System.out.println("Please, enter your password: ");
        String passwordAnswer = reader.readLine();
        User verifiedUser = User.checkPassword(user, passwordAnswer);
        if (verifiedUser == null) {
            System.exit(0);
        }
        System.out.println("Please, choose language. Write \"en\" for English and \"ru\" for Russian:");
        String language = reader.readLine();
        printMenu(language);

        String menuAnswer = reader.readLine();
        while (!menuAnswer.equals("6")) {
            StoreBasket basket;
            switch (menuAnswer) {
                case "1":
                    basket = StoreBasket.newBasket((Cashier) verifiedUser);
                    System.out.println(basket.toString());
                    break;
                case "2":
                    System.out.println("Please, choose from following list: ");
                    Item.getItem();
                    //StoreBasket.insertItem();
                    break;
                case "3":
                    //StoreBasket.removeItem();
                    break;
                case "4":
                    break;
                case "5":
                    break;
            }
            if (menuAnswer.equals("6")) {
                System.exit(0);
            }
            printMenu(language);
            menuAnswer = reader.readLine();
        }
    }
}
