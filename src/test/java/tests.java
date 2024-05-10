import org.example.Main;
import org.junit.jupiter.api.BeforeEach;
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
}
