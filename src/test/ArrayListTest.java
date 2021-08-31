package test;

import com.chunyue.list.ArrayList;
import org.junit.jupiter.api.BeforeAll;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    private static ArrayList<Integer> testArrayList = new ArrayList<>();
    private static ArrayList<String> testArrayList2 = new ArrayList<>();

    @BeforeAll
    public static void init(){
        testArrayList2.add(0, "Chunyue");
        testArrayList2.add(0, "Alex");
        System.out.println("testArrayList1 is " + Arrays.toString(testArrayList.getList()));
        System.out.println("testArrayList2 is " + Arrays.toString(testArrayList2.getList()));
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(testArrayList.size(), 0);
        assertEquals(testArrayList2.size(), 2);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertTrue(testArrayList.isEmpty());
        assertFalse(testArrayList2.isEmpty());
    }

}