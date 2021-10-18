package hw9_collections_own;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> test1 = new MyLinkedList<>();
        test1.add("hello");
        test1.addFirst("the 2nd");
        test1.addLast("java");

        System.out.println(test1.size());
        System.out.println(test1);
        System.out.println("test contains 1: " + test1.contains("1"));
        System.out.println("test contains java: " + test1.contains("java"));


        LinkedList<Integer> test = new LinkedList<>();
        test.add(1);
        test.add(4);
        test.add(5);

        System.out.println("linked list: " + test.remove(Integer.valueOf(1)) + test);

        List<String> stringList = new ArrayList<>();
        stringList.add("hello");

        MyLinkedList<Integer> myTest = new MyLinkedList<>();
        System.out.println("size: " + myTest.size());
        System.out.println("myTest " + myTest);

        myTest.addLast(2);
        System.out.println("myTest " + myTest);
        System.out.println("size: " + myTest.size());

        myTest.addFirst(3);
        System.out.println("myTest " + myTest);
        System.out.println("size: " + myTest.size());

        myTest.addFirst(4);
        System.out.println("myTest " + myTest);
        System.out.println("size: " + myTest.size());

        myTest.addLast(5);
        System.out.println("myTest " + myTest);
        System.out.println("size: " + myTest.size());

        myTest.add(5);
        System.out.println("myTest " + myTest);
        System.out.println("size: " + myTest.size());

        myTest.addAll(test);
        System.out.println("myTest " + myTest);
        System.out.println("size: " + myTest.size());

        //myTest.addAll(stringList);
        System.out.println("getFirst " + myTest.getFirst());
        System.out.println("getLast: " + myTest.getLast());

        myTest.add(0, 0);
        System.out.println("myTest " + myTest);

        System.out.println("myTest.contains 7: " + myTest.contains(7));

        System.out.println("My list removing: " + myTest.remove(Integer.valueOf(1)));
        System.out.println("size: " + myTest.size());
        System.out.println("myTest " + myTest);

        myTest.clear();
        System.out.println("size: " + myTest.size());
        System.out.println("myTest " + myTest);

    }
}

