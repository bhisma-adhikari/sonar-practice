import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    @InjectMocks
    Calculator calculator;

    @Mock
    Adder adder;

    @Test
    public void testAdd() {
        Mockito.when(adder.add(1,2)).thenReturn(3);
        Assertions.assertEquals(3, calculator.add(1,2));
    }
}
