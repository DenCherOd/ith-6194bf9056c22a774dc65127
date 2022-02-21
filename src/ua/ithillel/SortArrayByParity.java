package ua.ithillel;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        int indexOfOddNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[indexOfOddNumber];
                nums[indexOfOddNumber] = temp;
                indexOfOddNumber++;
            }
        }
        return nums;
    }

}