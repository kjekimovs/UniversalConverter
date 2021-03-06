package uconverter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by JavaCourses on 26.04.2017..
 */
@RunWith(Parameterized.class)
public class KelvinUnitConverterTest {
    KelvinUnitConverter converter = new KelvinUnitConverter();
    @Parameterized.Parameter(0)
    public double srcKelvin;
    @Parameterized.Parameter(1)
    public double trgKelvin;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {10.0, 10.0},
                {100.0, 100.0},
                {150.0, 150.0}
        });
    }

    public void toSI() throws Exception {
        assertEquals(trgKelvin, converter.toSI(srcKelvin), 0.00001);
    }

    @Test
    public void fromSI() throws Exception {
        assertEquals(srcKelvin, converter.fromSI(trgKelvin), 0.00001);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Kelvin", converter.getName());
    }

}