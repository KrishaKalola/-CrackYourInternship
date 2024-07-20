public static void main(String[] args) {
	int[] nums = {1,10,8,7,6,5,11};
	System.out.println(minCost(nums));
}

private static int minCost(int[] nums) {
	int[] tmp = new int[nums.length];
	Arrays.fill(tmp, 1);
	for(int i=0;i<nums.length-1;i++) {
		if(nums[i] < nums[i+1])
			tmp[i+1] = tmp[i] + 1;
	}
	for(int i=nums.length-2;i>=0;i--) {
		if(nums[i] > nums[i+1] && tmp[i] < tmp[i+1] + 1)
			tmp[i] = tmp[i+1] + 1;
	}
	int res = 0;
	for(int i : tmp)
		res+=i;
	return res;
}
