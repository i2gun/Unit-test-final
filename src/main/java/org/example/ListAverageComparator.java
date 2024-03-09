package org.example;

import java.util.List;

public class ListAverageComparator {

    public ListSumFinder listSumFinder;

    public ListAverageComparator(ListSumFinder sumFinder) {
        this.listSumFinder = sumFinder;
    }

    public void compareTwoAveragesOfLists(List<Double> list1, List<Double> list2) {
        System.out.println(compareTwoAverages(getAverageOfList(list1), getAverageOfList(list2)));
    }

    public String compareTwoAverages(Double firstListAverage, Double secondListAverage) {
        if (firstListAverage - secondListAverage > ProjectConstants.epsilon) {
            return "Первый список имеет большее среднее значение";
        } else if (secondListAverage - firstListAverage > ProjectConstants.epsilon) {
            return "Второй список имеет большее среднее значение";
        }
        return "Средние значения равны";
    }

    public Double getAverageOfList(List<Double> list) {
        if (list == null || list.isEmpty()) {
            return 0.0;
        }

        return listSumFinder.getArrayListSum(list) / list.size();
    }
}
