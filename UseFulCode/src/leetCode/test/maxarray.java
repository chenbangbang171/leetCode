package leetCode.test;

import java.util.Arrays;

public class maxarray {
	
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,2};
		System.out.println(maxProduct(arr));
	}
	
	//求出一个数组中最大和第二大值减一后的乘积
	 public static int maxProduct(int[] nums) {
	        Arrays.sort(nums);//快排
	        
	        return (nums[nums.length-1] - 1) * (nums[nums.length-2] - 1);
	        
	        
	    }

}
