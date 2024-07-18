import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testunitTest {

    @Test
    public void Suma() {
        Assertions.assertEquals(15,  testunit.Suma(5, 10));
    }
}