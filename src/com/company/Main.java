package com.company;

public class Main {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = "c";

        Integer eins = 1;
        Integer zwei = 2;
        Integer drei = 3;
        Integer vier = 4;
        Integer funf = 5;
        Integer noEins = -1;
        Integer zero = 0;

        MyList<Integer> integerList = new OrderedLinkedList<>();

        integerList.addItem(funf);
        integerList.addItem(vier);
        integerList.addItem(drei);
        integerList.addItem(zwei);
        integerList.addItem(eins);
        integerList.addItem(noEins);
        integerList.addItem(drei);
        integerList.addItem(vier);
        integerList.addItem(zero);

        integerList.printMyList();

        MyList<String> stringList = new OrderedLinkedList<>();

        stringList.addItem(b);
        stringList.addItem(a);
        stringList.addItem(c);

        stringList.printMyList();

    }




}
