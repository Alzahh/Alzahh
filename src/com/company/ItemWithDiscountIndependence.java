package com.company;

public class ItemWithDiscountIndependence extends ItemWithDiscount {

    private double discountIndependence;

    public ItemWithDiscountIndependence(String name, double discount, double discountIndependence) {
        super(name, discount);
        this.discountIndependence = discountIndependence;
    }

    public ItemWithDiscountIndependence(String name, double discount) {
        super(name, discount);
    }

    public double getDiscountIndependence() {
        return discountIndependence;
    }
    //allow manager to set discount independence
    public void setDiscountIndependence(double discountIndependence) {
        this.discountIndependence = discountIndependence;
    }

    public double getTheFirstDiscount() {
        return super.getDiscount();
    }

    @Override
    public double getDiscount() {
        return super.getDiscount() + discountIndependence;  //+ new discount
    }

    @Override
    public void setDiscount(double discount) {
        super.setDiscount(discount);
    }

    @Override
    public double getPriceWithDiscount() {
        return super.getPriceWithDiscount() - discountIndependence;  //- new sale
    }

    @Override
    public double calculateDiscount() {
        return super.calculateDiscount() + discountIndependence;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void printInfo() {
        System.out.println("Item name: " + super.getName() +
                "\nPrice: " + this.getPrice() +
                "\nDiscount + discount independence: " + this.calculateDiscount() +
                "\nPrice with discount: " + this.getPriceWithDiscount());
    }

}
