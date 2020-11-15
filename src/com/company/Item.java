package com.company;

public abstract class Item {
    private Item previousItem;
    private Item nextItem;

    private Object currentItemValue;

    public Item(Object currentItemValue) {
        this.currentItemValue = currentItemValue;
    }

    public int compareTo(Item item) {
        if (((String)(this.currentItemValue)).compareTo((String)(item.getCurrentItemValue())) == 0) {
            return 0;
        }
        else if (((String)(this.currentItemValue)).compareTo((String)(item.getCurrentItemValue())) > 0) {
            return 1; //"bigger", go leftb
        } else {
            return -1; //"smaller" go right
        }
    }

    @Override
    public String toString() {
        return "Item{" +
                "currentItemValue=" + currentItemValue +
                '}';
    }

    public Item getPreviousItem() {
        return previousItem;
    }

    public void setPreviousItem(Item leftItem) {
        this.previousItem = leftItem;
    }

    public Item getNextItem() {
        return nextItem;
    }

    public void setNextItem(Item nextItem) {
        this.nextItem = nextItem;
    }

    public Object getCurrentItemValue() {
        return currentItemValue;
    }

    public void setCurrentItemValue(Object currentItemValue) {
        this.currentItemValue = currentItemValue;
    }
}
