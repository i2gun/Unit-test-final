package testUnit;

import org.example.ListSumFinder;
import org.example.ProjectConstants;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestGetArraySumMethod {

    static ListSumFinder listSumFinder;

    @BeforeAll
    public static void initTest() {
        listSumFinder = new ListSumFinder();
    }

    @Test
    public void nullGetArrayListSumMethod() {
        Double result = listSumFinder.getArrayListSum(null);

        assertEquals(result, 0.0);
    }

    @Test
    public void emptyGetArrayListSumMethod() {
        List<Double> emptyList = new ArrayList<>();
        Double result = listSumFinder.getArrayListSum(emptyList);

        assertEquals(result, 0.0);
    }

    @Test
    public void testGetArrayListSumMethod() {
        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        Double expected = 6.0;

        Double result = listSumFinder.getArrayListSum(list);

        assertTrue(Math.abs(expected - result) < ProjectConstants.epsilon);
    }
}
