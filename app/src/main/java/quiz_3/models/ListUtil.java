package quiz_3.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListUtil <T extends Number> {
    private List<T> list;

    public ListUtil(){
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void add(T value){
        this.list.add(value);
    }

    public List<T> sortList(List listTest){
        listTest.sort(Comparator.comparingDouble(Number :: doubleValue));
        return listTest;
    }
}
