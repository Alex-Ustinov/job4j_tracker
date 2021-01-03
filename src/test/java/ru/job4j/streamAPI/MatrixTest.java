package ru.job4j.streamAPI;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void testConvertMatrix () {
        Integer[][] matrix = {{1, 4}, {5, 7}};
        List<Integer> rsl = Matrix.convertMatrix(matrix);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,4,5,7));
        assertThat(rsl, is(expected));
    }
}