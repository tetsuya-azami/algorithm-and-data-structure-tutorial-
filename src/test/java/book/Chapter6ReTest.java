package book;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Chapter6ReTest {
    @Test
    void coordinateCompression() {
        Chapter6ReTry chapter6ReTry = new Chapter6ReTry();
        int[] result = chapter6ReTry.coordinateCompression(new int[]{12, 43, 7, 15, 9});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }
}