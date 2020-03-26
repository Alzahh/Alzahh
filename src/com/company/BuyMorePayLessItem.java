package com.company;

public class BuyMorePayLessItem extends Item {


    private int moreThanNecessary;
    private int lessThanNecessary;

    public BuyMorePayLessItem(String name) {
        super(name);
    }

    public int getMoreThanNecessary() {
        return moreThanNecessary;
    }

    public int getLessThanNecessary() {
        return lessThanNecessary;
    }

    public void setMoreThanNecessary(int moreThanNecessary) {
        if (moreThanNecessary > 10) {
            throw new IllegalArgumentException("Too many items selected.");
        }
        this.moreThanNecessary = moreThanNecessary;
    }

    public void setLessThanNecessary(int lessThanNecessary) {
        if (lessThanNecessary < 0) {
            throw new IllegalArgumentException("Too few items selected.");
        }
        this.lessThanNecessary = lessThanNecessary;
    }

    @Override
    public double getDiscount() {
        return super.getDiscount();
    }

    @Override
    public double getPriceWithDiscount() {
        return super.getPriceWithDiscount();
    }

    @Override
    public double calculateDiscount() {
        return (moreThanNecessary-lessThanNecessary)*super.getPrice();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void printInfo() {
        System.out.println("Item name: " + super.getName() +
                "\nPrice: " + super.getPrice() +
                "\nMinimum number of item to buy: " + this.getLessThanNecessary() +
                "\nMaximum number of item to buy: " + this.getMoreThanNecessary());

    }

}
