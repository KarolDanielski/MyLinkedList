package com.company;

public class Main {

    public static void main(String[] args) {

        //----------TEST CODE----------
//      ----------Integer data type---------
        MyList<Integer> integerList = new OrderedLinkedList<>();

        Integer eins = 1;
        Integer zwei = 2;
        Integer drei = 3;
        Integer vier = 4;
        Integer funf = 5;
        Integer noEins = -1;
        Integer zero = 0;

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

        System.out.println("Found item: ");
        System.out.println(integerList.findItem(drei));

        integerList.removeItem(vier);
        integerList.printMyList();
        integerList.addItem(vier);
        integerList.printMyList();
//      ----------String data type----------
        MyList<String> stringList = new OrderedLinkedList<>();

        String a = "a";
        String b = "b";
        String c = "c";

        stringList.addItem(b);
        stringList.addItem(a);
        stringList.addItem(c);

        stringList.removeItem(a);
        stringList.printMyList();

        System.out.println("Found item: ");
        System.out.println(stringList.findItem(a));
    }
}
