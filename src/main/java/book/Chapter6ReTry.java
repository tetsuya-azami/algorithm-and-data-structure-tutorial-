package book;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Chapter6ReTry {
    public int[] coordinateCompression(int[] target) {
        int[] result = new int[target.length];
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < target.length; i++) {
            map.put(target[i], i);
        }

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[entry.getValue()] = i;
            i++;
        }

        return result;
    }

    public int[] coordinateCompressionRe(int[] target) {
        int[] result = new int[target.length];
        int[] sortedTarget = Arrays.copyOf(target, target.length);
        Arrays.sort(sortedTarget);

        for (int i = 0; i < target.length; i++) {
            int left = 0;
            int right = sortedTarget.length - 1;
            int middle = (left + right) / 2;
            while (left <= right) {
                middle = (left + right) / 2;
                if (sortedTarget[middle] == target[i]) {
                    break;
                } else if (sortedTarget[middle] < target[i]) {
                    left = middle + 1;
                } else if (sortedTarget[middle] > target[i]) {
                    right = middle - 1;
                }
            }
            result[i] = middle;
        }

        return result;
    }

    public int sunukeFestival(int[] a, int[] b, int[] c) {
        int result = 0;
        Arrays.sort(a);
        Arrays.sort(c);
        for (int j = 0; j < b.length; j++) {
            int lessThanB = getCountLessThanKey(a, b[j]);
            int greaterThanB = getCountGreaterThanKey(c, b[j]);

            result += lessThanB * greaterThanB;
        }

        return result;
    }

    private static int getCountGreaterThanKey(int[] array, int key) {
        int left = 0;
        int right = array.length;
        while (left < right) {
            int middle = (left + right) / 2;
            if (array[middle] > key) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return array.length - right;
    }

    private static int getCountLessThanKey(int[] array, int key) {
        int left = 0;
        int right = array.length;
        while (left < right) {
            int middle = (left + right) / 2;
            if (array[middle] < key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return left;
    }

    public int sunukeFestivalRe(int[] a, int[] b, int[] c) {
        int result = 0;
        for (int i = 0; i < b.length; i++) {
            int lessThanB = getLessThanB(a, b[i]);
            int greaterThanB = getGreaterThanB(c, b[i]);
            result += lessThanB * greaterThanB;
        }

        return result;
    }

    private int getGreaterThanB(int[] c, int b) {
        int left = 0;
        int right = c.length;
        while (left < right) {
            int middle = (left + right) / 2;
            if (b < c[middle]) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return c.length - right;
    }

    private int getLessThanB(int[] a, int b) {
        int left = 0;
        int right = a.length;
        while (left < right) {
            int middle = (left + right) / 2;
            if (a[middle] < b) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return left;
    }

    public int aggressiveCows(int[] array, int m) {
        Arrays.sort(array);
        int left = 0;
        int right = array[array.length - 1] - array[0];
        int result = 0;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int count = 1;
            int prev = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] - prev >= middle) {
                    count++;
                    prev = array[i];
                }
            }
            if (count >= m) {
                result = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return result;
    }
}
