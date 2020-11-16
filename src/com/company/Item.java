package com.company;

public abstract class Item {
    private Item previousItem;
    private Item nextItem;

    private Object currentItemValue;

    public Item(Object currentItemValue) {
        this.currentItemValue = currentItemValue;
        this.previousItem = null;
        this.nextItem = null;
    }

    public int compareTo(Item item) {
        if (((this.currentItemValue).toString()).compareTo((item.getCurrentItemValue()).toString()) == 0) {
            return 0;
        }
        else if (((this.currentItemValue).toString()).compareTo((item.getCurrentItemValue()).toString()) > 0) {
            return 1; //"bigger", go left
        } else {
            return -1; //"smaller" go right
        }
    }

    @Override
    public String toString() {
        return "" + this.currentItemValue + "";
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
}
