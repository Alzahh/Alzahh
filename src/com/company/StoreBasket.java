package com.company;

import java.util.ArrayList;
import java.util.List;

public class StoreBasket implements Menu{
    private static int id = 100;
    private int netAmount;
    private int totalAmount;
    private String type;
    private final double VAT = 0.2;
    private static List listOfItems = new ArrayList();
    private String dateAndTimeOfPurchase;
    private String storeAddress;
    private String nameOfCashier;
    private static int count = 0;

    public StoreBasket(Cashier cashier, String type) {
        this.nameOfCashier = cashier.getName();
        this.type = type;
        this.id = ++count;
    }


    public static int getId() {
        return id;
    }

    public int getNetAmount() {
        return netAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public double getVAT() {
        return VAT;
    }

    public String getType() {
        return type;
    }

    public List getListOfItems() {
        return listOfItems;
    }

    public String getDateAndTime() {
        return dateAndTimeOfPurchase;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public String getNameOfCashier() {
        return nameOfCashier;
    }

    public static StoreBasket newBasket(Cashier cashier) {
        return new StoreBasket(cashier, "loyal");
    }

    //@Override
    public static void insertItem(Item item) {
        listOfItems.add(item);
    }

    //@Override
    public static void removeItem(Item item) {
        listOfItems.remove(item);
    }

    @Override
    public void printBasket(StoreBasket basket) {
        basket.toString();

    }

    @Override
    public StoreBasket applyDiscount(StoreBasket basket, double percentage) {
        return null;
    }


    @Override
    public String toString() {
        return "StoreBasket{" +
                "netAmount=" + netAmount +
                ", totalAmount=" + totalAmount +
                ", VAT=" + VAT +
                ", listOfItems=" + listOfItems +
                ", dateAndTime='" + dateAndTimeOfPurchase + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", nameOfCashier='" + nameOfCashier + '\'' +
                '}';
    }
}
