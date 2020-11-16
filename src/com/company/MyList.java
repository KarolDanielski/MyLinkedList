package com.company;

public interface MyList<T extends Object> {

    void addItem(T newItem);
    void removeItem(Item item);
    Item findItem();
    void printMyList();


}
