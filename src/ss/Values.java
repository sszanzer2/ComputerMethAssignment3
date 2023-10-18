package ss;

public class Values {
	
	public static int getSum(int [] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static int getMax(int[] nums) {
		int max = Integer.MIN_VALUE;
		for(int x = 0; x < nums.length; x++) {
			if(nums[x] > max) {
				max = nums[x];
			}
		}
		return max;
	}
	
	public static int getMin(int [] nums) {
		int min = Integer.MAX_VALUE;
		for(int y = 0; y < nums.length; y++) {
			if(nums[y] < min) {
				min=nums[y];
			}
		}
		return min;
	}
	
	public static int getRange(int [] nums) {
		int min = getMin(nums);
		int max = getMax(nums);
		return max-min+1 ;
	}

}
