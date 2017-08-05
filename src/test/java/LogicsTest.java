import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import javax.ejb.Startup;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Aleksandr on 05.08.2017.
 */
@RunWith(Parameterized.class)
public class LogicsTest {
    private static Logics lg;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {2, 2},
                {15, 10},
                {5, 5}
        });
    }
    int x1, x2;

    public LogicsTest(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }


    @BeforeClass
    public static void bf(){
       lg = new Logics();
    }
    @Test
    public void eq() throws Exception {
        assertTrue("Не равны "+x1+","+x2, lg.eq(x1,x2));
    }

}