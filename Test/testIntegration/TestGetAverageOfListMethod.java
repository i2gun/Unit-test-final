package testIntegration;

import org.example.ListAverageComparator;
import org.example.ListSumFinder;
import org.example.ProjectConstants;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestGetAverageOfListMethod {

    static ListAverageComparator listAverageComparator;

    @BeforeAll
    public static void initTest() {
        ListSumFinder sumFinder = new ListSumFinder();
        listAverageComparator = new ListAverageComparator(sumFinder);
    }

    @Test
    public void testGetAverageOfListMethod() {
        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        Double expected = 2.0;

        Double result = listAverageComparator.getAverageOfList(list);

        assertTrue(Math.abs(expected - result) < ProjectConstants.epsilon);
    }
}
