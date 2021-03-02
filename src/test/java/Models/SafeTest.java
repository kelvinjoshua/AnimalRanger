package Models;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

public class SafeTest {

        @Rule
        public DataBaseRule dataBaseRule = new DataBaseRule();



        @Test
        void instantiatesWell_true(){
                Safe testObj =new Safe("lion");
                assertTrue(testObj instanceof Safe);
        }
         /*save adds object correctly*/

      @Test
        public  void Save_insertsObjectIntoDB(){
              Safe testObj =new Safe("lion");
              testObj.save();
              assertTrue(Safe.all().get(0).equals(testObj));
      }




}