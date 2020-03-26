package com.company;

public class ItemTakeItAll extends ItemWithDiscount {

    private int minimumNumberToBePurchased;

    public ItemTakeItAll(String name, double discount) {
        super(name, discount);
    }

    public int getMinimumNumberToBePurchased() {
        return minimumNumberToBePurchased;
    }

    public void setMinimumNumberToBePurchased(int minimumNumberToBePurchased) {
        this.minimumNumberToBePurchased = minimumNumberToBePurchased;
    }

    @Override
    public double getDiscount() {
        return super.getDiscount();
    }

    @Override
    public void setDiscount(double discount) {
        super.setDiscount(discount);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double calculateDiscount() {
        return super.calculateDiscount();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public double getPriceWithDiscount() {
        return super.getPriceWithDiscount();
    }

    @Override
    public void printInfo() {
        System.out.println("Item name: " + super.getName() +
                "\nPrice: " + super.getPrice() +
                "\nDiscount: " + super.discount +
                "\nPrice with discount: " + super.getPriceWithDiscount() +
                "\nMinimum number to be purchased: " + this.minimumNumberToBePurchased);
    }
}
