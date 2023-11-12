package Week6.Lab6.Generics;

import java.util.ArrayList;
import java.util.List;

public class ReverseOrderOfList {
    public static <T> List<T> reverseList(List<T> originalList) {
        List<T> reversedList = new ArrayList<>();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }
}
