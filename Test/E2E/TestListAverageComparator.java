package E2E;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.example.ListAverageComparator;
import org.example.ListSumFinder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestListAverageComparator {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    static ListAverageComparator listAverageComparator;
    static List<Double> list1;
    static List<Double> list2;

    @BeforeAll
    public static void initTest() {
        ListSumFinder sumFinder = new ListSumFinder();
        listAverageComparator = new ListAverageComparator(sumFinder);
    }

    @BeforeEach
    public void setUp() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testFirstAverageIsBiggerThanSecond() {
        list1.add(2.0);
        list1.add(3.0);
        list1.add(4.0);
        list2.add(1.0);
        list2.add(2.0);
        list2.add(3.0);

        listAverageComparator.compareTwoAveragesOfLists(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testSecondAverageIsBiggerThanFirst() {
        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.0);
        list2.add(2.0);
        list2.add(3.0);
        list2.add(4.0);

        listAverageComparator.compareTwoAveragesOfLists(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testTwoAverageNumbersAreEqual() {
        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.0);
        list2.add(1.0);
        list2.add(2.0);
        list2.add(3.0);

        listAverageComparator.compareTwoAveragesOfLists(list1, list2);

        assertEquals("Средние значения равны", outputStreamCaptor.toString().trim());
    }

}
