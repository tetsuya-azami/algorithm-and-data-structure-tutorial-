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
}
