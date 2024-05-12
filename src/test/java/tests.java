import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class tests {
    private List<Integer> readFile(String path) {
        List<Integer> nums = new ArrayList<>();
        Main._readFile(nums, path);
        return nums;
    }

    @Test
    public void testFile1() {
        String path_name = "./test1.txt";
        List<Integer> nums = readFile(path_name);
        assertEquals(1, Main._min(nums));
        assertEquals(10, Main._max(nums));
        assertEquals(55, Main._sum(nums));
        assertEquals(3628800, Main._mult(nums));
    }

    @Test
    public void testFile2() {
        String path_name = "./test2.txt";
        List<Integer> nums = readFile(path_name);
        assertEquals(-5, Main._min(nums));
        assertEquals(5, Main._max(nums));
        assertEquals(0, Main._sum(nums));
        assertEquals(0, Main._mult(nums));
    }

    @Test
    public void testFile3() {
        String path_name = "./test3.txt";
        List<Integer> nums = readFile(path_name);
        assertEquals(5, Main._min(nums));
        assertEquals(5, Main._max(nums));
        assertEquals(25, Main._sum(nums));
        assertEquals(3125, Main._mult(nums));
    }

    @Test
    public void testFile4() {
        String path_name = "./test4.txt";
        List<Integer> nums = readFile(path_name);
        assertEquals(777, Main._min(nums));
        assertEquals(777, Main._max(nums));
        assertEquals(777, Main._sum(nums));
        assertEquals(777, Main._mult(nums));
    }

    @Test
    public void testFile5() {
        String path_name = "./test5.txt";
        List<Integer> nums = readFile(path_name);
        assertEquals(100, Main._min(nums));
        assertEquals(10000, Main._max(nums));
        assertEquals(11100, Main._sum(nums));
        assertEquals(1000000000, Main._mult(nums));
    }
}
