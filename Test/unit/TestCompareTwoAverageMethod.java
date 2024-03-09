package unit;

import org.example.ListAverageComparator;
import org.example.ListSumFinder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompareTwoAverageMethod {

    static ListAverageComparator listAverageComparator;

    @BeforeAll
    public static void initTest() {
        ListSumFinder sumFinder = new ListSumFinder();
        listAverageComparator = new ListAverageComparator(sumFinder);
    }

    @Test
    public void testFirstAverageIsBiggerThanSecond() {
        assertEquals("Первый список имеет большее среднее значение",
                listAverageComparator.compareTwoAverages(6.0, 5.0));
    }

    @Test
    public void testSecondAverageIsBiggerThanFirst() {
        assertEquals("Второй список имеет большее среднее значение",
                listAverageComparator.compareTwoAverages(5.0, 6.0));
    }

    @Test
    public void testTwoAverageNumbersAreEqual() {
        assertEquals("Средние значения равны",
                listAverageComparator.compareTwoAverages(6.0, 6.0));
    }
}
