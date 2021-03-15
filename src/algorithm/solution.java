package algorithm;

public class solution {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int target = 5;
        System.out.println(twoSum(arr, target)[0]+twoSum(arr,target)[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
