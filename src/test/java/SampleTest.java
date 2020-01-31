import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SampleTest {
    public void SimpleTestPass(){
        int a = 1;
        int b = 2;
        assertTrue(a+b==3);
    }
    public void SimpleTestFail(){
        int a = 1;
        int b = 2;
        assertTrue(a+b==4);
    }

}
