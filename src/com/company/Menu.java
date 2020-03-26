package com.company;

import java.util.Locale;

public interface Menu  {
//    public void insertItem(Item item);
//    public void removeItem(Item item);
    public void printBasket(StoreBasket basket);
    public StoreBasket applyDiscount(StoreBasket basket, double percentage);
}
