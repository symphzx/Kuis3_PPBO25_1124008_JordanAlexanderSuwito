package quiz_3.controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import quiz_3.models.EmptyListException;

public class StatisticList<T extends Number> {
    private List<T> listUtil;
    private List<T> sortedList;

    public StatisticList(){
        listUtil = new ArrayList<>();
        sortedList = new ArrayList<>(listUtil);
    }

    public void add(T value){
        listUtil.add(value);
    }

    public double getAverage() throws EmptyListException {
        if (listUtil.isEmpty()) {
            throw new EmptyListException("List Still Empty");
        }
        double totalSum = 0;
        for (T result : listUtil) {
            totalSum += result.doubleValue();
        }
        return totalSum / listUtil.size();
    }

    public T getMax() throws EmptyListException {
        if (listUtil.isEmpty()){
            throw new EmptyListException("List Still Empy");
        }
        T max = listUtil.get(0);
        for (T result : listUtil) {
            if(result.doubleValue() > max.doubleValue()){
                max = result;
            }
        }
        return max;
    }

    public T getMin() throws EmptyListException {
        if (listUtil.isEmpty()){
            throw new EmptyListException("List Still Empty");
        }
        T min = listUtil.get(0);
        for (T result : listUtil) {
            if(result.doubleValue() < min.doubleValue()){
                min = result;
            }
        }
        return min;
    }

    public double getMedian() throws EmptyListException {
        if (sortedList.isEmpty()){
            throw new EmptyListException("List Still Empty");
        }
        int mid = sortedList.size() / 2;
        if (sortedList.size() % 2 == 0) {
            return sortedList.get(mid).doubleValue() + sortedList.get(mid + 1).doubleValue() / 2;
        }
        return sortedList.get(mid).doubleValue();
    }

    public List<T> getStatisticList(){
        return this.sortedList;
    }
}
