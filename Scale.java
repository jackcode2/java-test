	/**
     * 10 进制转 16 进制，计算公式如下例
     * 1958 转 16 进制
     * 1958 % 16 == 6   1958 / 16 == 122
     * 122 % 16 == 10 也就是 A   122 / 16 == 7
     * 7 < 16
     * 1958 的 16 进制 为 7A6
     * @param n
     * @return
     */
	 public class Scale{
		 public static String decToHex(int n) {
		String r = "";
		while(n>16)
		{
			int yushu=n%16;
			int shang=n\16;
			if(yushu>9)
			{
				char c=(char)(yushu-10+'A');
				r+=c;
			}
			else{
			r+=yushu;
			}
			n=shang;
		}
		if(n>9)
		{
			char c=(char)(yushu-10+'A');
				r+=c;
			}
			else{
			r+=yushu;
			}
			return reverse(r);
	}
			public static void main(String[] args) {	
				System.out.println(decToHex(1958));
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				