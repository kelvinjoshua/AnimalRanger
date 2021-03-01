package Models;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

public class SafeTest {

        @Test
        void instantiatesWell_true(){
                Safe testObj =new Safe("lion");
                assertTrue(testObj instanceof Safe);
        }
         /*save adds object correctly*/

}