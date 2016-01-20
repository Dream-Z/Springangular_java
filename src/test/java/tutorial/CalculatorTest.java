package tutorial;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tutorial.mvc.Calculator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by lexx on 1/19/16.
 */
public class CalculatorTest {
    int exp, act;

    @Mock
    private Calculator clc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testAbs()
    {
        when(clc.abs(-20)).thenReturn()
        assertEquals(0, clc.abs(-4));
    }
}
