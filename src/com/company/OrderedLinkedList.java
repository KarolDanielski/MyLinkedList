package com.company;

public class OrderedLinkedList<T extends Object> implements MyList<T>{

    private Item root = null;

    @Override
    public void addItem(T newItem) {
        Item newNode = new Node(newItem);
        int comparisonResult;
        Item itemFromList;

        if (this.root == null) {
            this.root = newNode;
        }
        else {
            itemFromList = this.root;
            while (itemFromList != null) {
            comparisonResult = itemFromList.compareTo(newNode);
            if (comparisonResult == 0 ) {
                System.out.println("Item already on the list.");
                break;
            }
            else if (comparisonResult > 0) {
                System.out.println(newNode + " goes higher than "  + itemFromList);
                if (itemFromList.getPreviousItem() == null) {
                    this.root = newNode;
                    System.out.println("Setting root to: " + newNode);
                }
                newNode.setNextItem(itemFromList);
                System.out.println("newNode.setNextItem(itemFromList) = " + newNode.getNextItem());
                newNode.setPreviousItem(itemFromList.getPreviousItem());
                System.out.println("newNode.setPreviousItem(itemFromList.getPreviousItem()) = " + newNode.getPreviousItem());
                if (itemFromList.getPreviousItem() != null) {
                    itemFromList.getPreviousItem().setNextItem(newNode);
                }
                itemFromList.setPreviousItem(newNode);
                System.out.println("itemFromList.setPreviousItem(newNode) = " + itemFromList.getPreviousItem() );
                System.out.println("itemFromList: " + itemFromList + " newNode: " + newNode );
                System.out.println("");

                break;

            }
            else if (itemFromList.getNextItem() == null) { //umieść na końcu
                System.out.println(newNode + " goes to the end");
                newNode.setPreviousItem(itemFromList);
                newNode.setNextItem(itemFromList.getNextItem());
                itemFromList.setNextItem(newNode);
                break;
            }
            itemFromList = itemFromList.getNextItem();
            }
        }


        }

    @Override
    public void removeItem(Item item) {

    }

    @Override
    public Item findItem() {
        return null;
    }
    @Override
    public void printMyList() {
        Item currentItem = this.root;
        while(currentItem != null) {
            System.out.println(currentItem.toString());
            currentItem = currentItem.getNextItem();
        }
    }
}
