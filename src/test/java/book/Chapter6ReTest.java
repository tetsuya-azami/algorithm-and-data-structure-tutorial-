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

    @Test
    void coordinateCompressionRe() {
        Chapter6ReTry chapter6ReTry = new Chapter6ReTry();
        int[] result = chapter6ReTry.coordinateCompressionRe(new int[]{12, 43, 7, 15, 9});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }

    @Test
    void sunukeFestival() {
        Chapter6ReTry chapter6ReTry = new Chapter6ReTry();
        int result = chapter6ReTry.sunukeFestival(new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9});
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(result);
    }
}