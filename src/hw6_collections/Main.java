package hw6_collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Task1: Removing elements of the Array list that meet condition
        System.out.println("\n---------------- Task1 --------------");
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        list.removeIf(i -> (i % 3 == 0));
        System.out.println("Array list without elements that are divisible by 3:\n" + list);


        //Task2: Changing Orange to Grapefruit element if exists
        System.out.println("\n---------------- Task2 --------------");

        ArrayList<String> fruits1 = new ArrayList<>();
        fruits1.add("Orange");
        fruits1.add("Cherry");
        fruits1.add("Banana");
        fruits1.add("Peach");
        fruits1.add("Apple");
        fruits1.add("Orange");

        System.out.println("\nArray list:\n" + fruits1);
        ArrayHelp.replaceAllOrThrowMessage(fruits1, "Orange", "Grapefruit");
        System.out.println("\nArray list after changing Orange to Grapefruit:\n" + fruits1);
        ArrayHelp.replaceAllOrThrowMessage(fruits1, "Orange", "Grapefruit");
        System.out.println("\nArray list after changing Orange to Grapefruit:\n" + fruits1);


        //Task3: Check if 2 Arrays have similar elements
        System.out.println("\n---------------- Task3 --------------");

        ArrayList<String> listFlowers1 = new ArrayList<>();
        ArrayList<String> listFlowers2 = new ArrayList<>();

        listFlowers1.add("rose");
        listFlowers1.add("iris");
        listFlowers1.add("lily");
        listFlowers1.add("tulip");
        listFlowers1.add("aster");

        listFlowers2.add("crocus");
        listFlowers2.add("lily");
        listFlowers2.add("violet");
        listFlowers2.add("rose");
        listFlowers2.add("daisy");

        System.out.println("List1: " + listFlowers1);
        System.out.println("List2: " + listFlowers2);
        System.out.println("---------- Similar elements -----------");
        ArrayHelp.checkSimilarElementsExist(listFlowers1, listFlowers2);
    }
}

class ArrayHelp {
    public static <T> void replaceAllOrThrowMessage(ArrayList<T> list, T whatReplace, T whatInsert) {
        boolean exists = list.contains(whatReplace);
        if (exists) {
            list.replaceAll(i -> i.equals(whatReplace) ? whatInsert : i);
        } else System.out.println("\nSuch list doesn't contain a value: " + whatReplace);
    }

    public static <T> void checkSimilarElementsExist(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> similarList = new ArrayList<>(list1);
        similarList.retainAll(list2);

        if (similarList.size() == 0) {
            System.out.println("Such lists have no similar elements!");
        } else System.out.println(String.format("Such lists contain %d similar element(s): \n%s", similarList.size(),
                similarList));
    }
}
