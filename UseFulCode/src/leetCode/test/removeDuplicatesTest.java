package leetCode.test;

public class removeDuplicatesTest {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] != nums[j]) {
                    for (int k = j; k < len; k++) {
                        nums[k - j + i + 1] = nums[k];
                    }
                    len -= (j - i - 1);
                    break;
                }
                if (j == len - 1) {
                    return i;
                }
            }
        }
        return len;
    }

    /*
     *
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * */
    public static int removeDuplicates2(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
}
