package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class TestHello {

    @Test
    public void helloTest(){
        assertEquals("hello","hello");
    }

}
