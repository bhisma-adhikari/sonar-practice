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

    @Mock
    Divider divider;

    @Test
    public void testAdd() {
        Mockito.when(adder.add(1,2)).thenReturn(3);
        Assertions.assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void testDivide() {
        Mockito.when(divider.divide(30, 3)).thenReturn(10);
        Assertions.assertEquals(10, calculator.divide(30, 3));
    }

    @Test
    public void testDivideByZero() {
        Mockito.when(divider.divide(1,0)).thenThrow(new ArithmeticException());
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
}
