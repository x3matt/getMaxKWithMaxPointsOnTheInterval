
import org.junit.*;
import static org.junit.Assert.*;

public class TestClass {

    private Solution solution;

    @Before
    public void init(){
        solution = new Solution();
    }
    @Test
    public void testGetMaxK(){
        double[] arr = {1.1119,2.29,3.32,4.33,5.21,6.9,12.543,7.8,5.6,5.3,5.4,14.1,14.5,14.6,13.2,12.6,13.65};
        assertEquals(2.29,solution.getMaxK(arr,3.59),0);
        assertEquals(1.1119,solution.getMaxK(arr,6.666),0);
        assertEquals(12.543,solution.getMaxK(arr,2.5),0);
    }
}
