package book;

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
}
