
	public static void Swap(int [] a,int i,int j)
	{
		 int t=a[i];
		 a[i]=a[j];
         a[j]=t;
	}
	public static void bubbleSort1(int[] a){
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>i;j--)
			{
							if (a[j] < a[j - 1]) {
					swap(a, j, j - 1);
				}
			}
		}
	}	
	