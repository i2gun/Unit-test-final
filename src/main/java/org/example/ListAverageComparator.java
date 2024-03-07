package org.example;

import java.util.List;

public class ListAverageComparator {
    public final double epsilon = 0.000001;

    public void compareTwoAveragesOfLists(List<Double> list1, List<Double> list2) {
        System.out.println(compareTwoAverages(getAverageOfList(list1), getAverageOfList(list2)));
    }

    public Double getArrayListSum(List<Double> list) {
        Double sum = 0.0;
        for (Double num : list) {
            sum += num;
        }
        return sum;
    }

    public String compareTwoAverages(Double firstListAverage, Double secondListAverage) {
        if (firstListAverage - secondListAverage > epsilon) {
            return "Первый список имеет большее среднее значение";
        } else if (secondListAverage - firstListAverage > epsilon) {
            return "Второй список имеет большее среднее значение";
        }
        return "Средние значения равны";
    }

    public Double getAverageOfList(List<Double> list) {
        if (list.isEmpty()) {
            return 0.0;
        }

        return getArrayListSum(list) / list.size();
    }
}
