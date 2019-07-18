public class Factorial{
	public static long factorial(int n) {
		if(n==1||n==0)
		{
			return 1;
		}
		else{
			 return n*factorial(n-1);
		}
		
		public static long factorial2(int n){
			int r=1;
			for(int i=1;i<=n;i++)
			{
				r*=i;
			}
			return r;
public static double calce(int n){
	double e=0;
	for(int i=0;i<n;i++)
	{
		e+=(double)(1/factorial(i));
	}
	return e;
}
		public static void main(String[] args) {
		System.out.printf("e = %f%n", calcE(10000));
		}
		}
		
		
		
		
		
		
		
		
		
		
		