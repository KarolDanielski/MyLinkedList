package com.company;

public interface MyList<T extends Object> {

    void addItem(T newItem);
    void removeItem(T itemToRemove);
    Item findItem(T itemToFind);
    void printMyList();
}
