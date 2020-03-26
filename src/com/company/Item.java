package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Item {
    private String name;
    private static int id = 10;
    private int price;
    private static int count = 0;
    private double discount = 0;


    public Item(String name) {
        Random random = new Random();
        this.name = name;
        this.price = random.nextInt(1000);
        this.id = ++count;
    }

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public double getPriceWithDiscount() {
        return price;      //not discount yet
    }

    public void printInfo() {
        System.out.println("Item name: " + this.getName() + "\nPrice: " + this.getPrice() +  "\nDiscount: " + this.discount + "\nID: " + this.id);
    }

    public double calculateDiscount(){
        return discount;
    }


    public static List<Item> getItem() {
        ItemWithDiscount itemWithDiscount = new ItemWithDiscount("pen", 10);
        ItemWithDiscountIndependence itemWithDiscountIndependence = new ItemWithDiscountIndependence("pensil", 5);
        ItemTakeItAll itemTakeItAll = new ItemTakeItAll("book", 1);
        BuyMorePayLessItem buyMorePayLessItem = new BuyMorePayLessItem("rubber");

        return new ArrayList(Arrays.asList(itemWithDiscount,itemWithDiscountIndependence,itemTakeItAll,buyMorePayLessItem));
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
