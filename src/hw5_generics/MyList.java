package hw5_generics;

import java.util.ArrayList;

public class MyList<T extends Number> {
    ArrayList<T> arrayList = new ArrayList<>();

    public void add(T element) {
        arrayList.add(element);
    }

    public T largest() {
        T max = arrayList.get(0);
        for (T el : arrayList) {
            if (el.longValue() > max.longValue()) {
                max = el;
            }
        }
        return max;
    }

    public T smallest() {
        T min = arrayList.get(0);
        for (T el : arrayList) {
            if (el.longValue() < min.longValue()) {
                min = el;
            }
        }
        return min;
    }


}
