package quiz_3.utils;

import java.util.Comparator;
import java.util.List;

public class ListUtil<T extends Number> {
    public static <T extends Number> List<T> getSortedList(List<T> list) {
        list.sort(Comparator.comparingDouble(Number::doubleValue));
        return list;
    }
}
