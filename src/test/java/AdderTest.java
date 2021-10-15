import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class AdderTest {

    @Test
    public void testAdd() {
        Adder adder = new Adder();
        Assertions.assertEquals(3, adder.add(1,2));
    }

}
