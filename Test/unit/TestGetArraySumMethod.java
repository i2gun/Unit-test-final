package unit;

import org.example.ListAverageComparator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestGetArraySumMethod {

    static ListAverageComparator listAverageComparator;

    @BeforeAll
    public static void initTest() {
        listAverageComparator = new ListAverageComparator();
    }

    @Test
    public void testGetArrayListSum() {
        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);

        Double expected = 6.0;

        assertTrue(Math.abs(expected - listAverageComparator.getArrayListSum(list)) < listAverageComparator.epsilon);
    }
}
