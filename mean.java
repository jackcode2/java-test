public static double average(int[] a) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int v : a) {
			sum += v;
			
			if (v > max) {
				max = v;
			}
			
			if (v < min) {
				min = v;
			}
		}
		
		return (double)(sum - max - min) / (a.length - 2);
	}