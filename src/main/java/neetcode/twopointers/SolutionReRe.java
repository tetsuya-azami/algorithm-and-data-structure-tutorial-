package neetcode.twopointers;

public class SolutionReRe {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] result = new int[2];
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
