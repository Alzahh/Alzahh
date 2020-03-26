package com.company;

public class ItemWithDiscount extends Item {

    public double discount;

    public ItemWithDiscount(String name, double discount) {
        super(name);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
    //allow manager to set discount
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void printInfo() {
        System.out.println("Item name: " + super.getName() +
                "\nPrice: " + this.getPrice() +
                "\nDiscount: " + this.discount +
                "\nPrice with discount: " + this.getPriceWithDiscount());
    }

    @Override
    public double getPriceWithDiscount() {
        return super.getPrice() - discount;
    }

    public double calculateDiscount() {
        return this.discount;
    }

    @Override
    public String toString() {
        return super.toString();
    }






}


