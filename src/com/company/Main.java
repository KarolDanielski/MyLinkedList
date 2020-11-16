package com.company;

public class Main {

    public static void main(String[] args) {

        String one = "b";
        String two = "c";
        String three = "a";

        Integer eins = 1;
        Integer zwei = 2;
        Integer drei = 3;
        Integer vier = 4;
        Integer funf = 5;

        MyList<Integer> newList = new OrderedLinkedList<>();

//        newList.addItem(one);
//        newList.addItem(new Node(two));
//        newList.addItem(new Node(three));
//        newList.addItem(new Node(on));
        newList.addItem(funf);
        newList.addItem(vier);
//        newList.addItem(drei);
        newList.addItem(zwei);
        newList.addItem(eins);
        newList.addItem(drei);

//        newList.addItem(vier);
//
        newList.printMyList();


    }




}
