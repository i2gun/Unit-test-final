package unit;

import java.util.ArrayList;
import java.util.List;

import org.example.ListAverageComparator;
import org.example.ListSumFinder;
import org.example.ProjectConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class TestGetAverageOfListMethod {

    ListSumFinder mockListSumFinder;
    ListAverageComparator listAverageComparator;
    List<Double> list;
    Double expectedAverage = 2.0;
    Double expectedSum = 6.0;

    @BeforeEach
    public void initTest() {
        list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        expectedAverage = 2.0;
        expectedSum = 6.0;
        mockListSumFinder = mock(ListSumFinder.class);
        listAverageComparator = new ListAverageComparator(mockListSumFinder);
    }

    @Test
    public void nullTestGetAverageOfListMethod() {
        Double result = listAverageComparator.getAverageOfList(null);

        assertTrue(result == 0.0);
    }

    @Test
    public void emptyTestGetAverageOfListMethod() {
        List<Double> emptyList = new ArrayList<>();
        Double result = listAverageComparator.getAverageOfList(emptyList);

        assertTrue(result == 0.0);
    }

    @Test
    public void mockTestGetAverageOfListMethod() {
        when(mockListSumFinder.getArrayListSum(list)).thenReturn(expectedSum);

        Double result = listAverageComparator.getAverageOfList(list);

        assertTrue(Math.abs(expectedAverage - result) < ProjectConstants.epsilon);
    }

    @Test
    public void dummyTestGetAverageOfListMethod() {
        when(mockListSumFinder.getArrayListSum(anyList())).thenReturn(expectedSum);

        Double result = listAverageComparator.getAverageOfList(list);

        assertTrue(Math.abs(expectedAverage - result) < ProjectConstants.epsilon);
    }

    @Test
    public void spyTestGetAverageOfListMethod() {
        listAverageComparator.getAverageOfList(list);

        verify(mockListSumFinder, times(1)).getArrayListSum(list);
    }

    @Test
    public void countTestGetAverageOfListMethod() {
        listAverageComparator.getAverageOfList(list);

        verify(mockListSumFinder, times(1)).getArrayListSum(anyList());
    }
}
