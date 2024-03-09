package org.example;

import java.util.List;

public class ListSumFinder {

    public Double getArrayListSum(List<Double> list) {
        if (list == null || list.isEmpty()) {
            return 0.0;
        }

        Double sum = 0.0;
        for (Double num : list) {
            sum += num;
        }
        return sum;
    }
}
