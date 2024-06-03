package lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    public void reverseArray() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] result = ReverseArray.reverseArray(array);
        assertEquals(1, result[4]);
    }

}