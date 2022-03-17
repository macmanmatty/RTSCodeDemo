import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class UtilTest {

    Utilities utilities = new Utilities();

    List<Integer> numbers = new ArrayList<Integer>();


    @Before
    public void setup() {
        numbers.add(1);
        numbers.add(0);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(null);
        numbers.add(5);

    }
    @Test
   public void  shiftStringTest(){
        String test = utilities.shiftString("123456", 2);
        String test2 = utilities.shiftString("123456", 8);
        String test3 = utilities.shiftString("123456", -8);
        assertEquals(test, "561234");
       assertEquals(test2, "561234");
       assertEquals(test3, "345612");

    }


    @Test
    public void  aboveBelowTest(){
        Map count = utilities.aboveBelow(numbers, 2);
        assertEquals(count.get("Number of Integers Above Compare Value"), 3);
        assertEquals(count.get("Number of Integers Below Compare Value"), 3);
        assertEquals(count.get("Number Of Null Values"), 1);

    }

}
