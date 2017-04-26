package uconverter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */
@RunWith(Parameterized.class)
public class CelsiusUnitConverterTest {
    CelsiusUnitConverter converter = new CelsiusUnitConverter();
    @Parameterized.Parameter(0)
    public double celsius;
    @Parameterized.Parameter(1)
    public double kelvin;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0.0, 273.15},
                {-100.0, 173.15},
                {150.0, 423.15}
        });
    }
    public void toSI() throws Exception {
        assertEquals(kelvin, converter.toSI (celsius), 0.00001);
    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(celsius, converter.fromSI (kelvin), 0.00001);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Celsius", converter.getName());
    }

}