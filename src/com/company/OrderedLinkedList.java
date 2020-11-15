package com.company;

public class OrderedLinkedList implements MyList{

    private Item root = null;

    @Override
    public void addItem(Item newItem) {

        Item itemFromList = this.root; //start from the top

        while (itemFromList != null) {
            if (this.root == null) {
            this.root = newItem;
            } else {
                int comparison = newItem.compareTo(itemFromList);
                if (comparison == 0) {
                    System.out.println("Item already on the list");
                }
                else if (comparison > 0) {
                    Item previousItem = itemFromList.getPreviousItem();
                    if (previousItem == null) {
                        this.root = newItem;
                    }
                    newItem.setPreviousItem(previousItem);
                    newItem.setNextItem(itemFromList);
                    itemFromList.setPreviousItem(newItem);
                    break;
                }
                else { //comparison < 0
                    Item nextItem = itemFromList.getNextItem();
                    newItem.setNextItem(nextItem);
                    newItem.setPreviousItem(itemFromList);
                    itemFromList.setNextItem(newItem);
                }
            }
            itemFromList = itemFromList.getNextItem();
        }
    }

    @Override
    public void removeItem(Item item) {

    }

    @Override
    public Item findItem() {
        return null;
    }
}
