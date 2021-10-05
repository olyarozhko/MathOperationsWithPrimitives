package hw5_generics;

public class Main {
    public static void main(String[] args) {

        MyList<Number> myList = new MyList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(-1);
        myList.add(0);

        System.out.println("max: " + myList.largest());
        System.out.println("min: " + myList.smallest());


    }
}
