public static int[] rotate(int[] nums, int k) {
		k = k % nums.length;
		int[] rightPart = Arrays.copyOfRange(nums, nums.length - k, nums.length);
		//System.out.println(Arrays.toString(rightPart));
		System.arraycopy(nums, 0, nums, k, nums.length - k);
		//System.out.println(Arrays.toString(nums));
		System.arraycopy(rightPart, 0, nums, 0, k);
	
		return nums;
	}