  /**
     * 利用公式
     * Pi / 4 = 1/1 - 1/3 + 1/5 - 1/7 + 1/9 - ...
     * 计算 pi 的值
     * @param n 一共计算多少项
     * @return
     */
	 public class Pi{
		 public static double calcPi(int n) {
			 double pi4=0;
			 for(int i=0;i<n;i++)
			 {
				 int fenmu=2*i+1;
				 double item=(double)(1/fenmu);
				 if(i%2==0)
				 {		
			 pi4 += item;
			} 
			else 
			{
				pi4 -= item;
			}
		}
		return pi4*4
		 }
	 }
					 