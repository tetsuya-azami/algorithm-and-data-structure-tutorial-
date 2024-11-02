package neetcode.twopointers;

public class SolutionRe {
    public int[] twoSumBruteForce(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                } else if (numbers[i] + numbers[j] > target) {
                    break;
                }
            }
        }

        return new int[]{};
    }

    public int[] twoSumTwoPointers(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }
}
