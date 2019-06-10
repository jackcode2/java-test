package huiwen;
import java.util.Scanner;
public class jiafa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        long n = input.nextLong();
        System.out.println(sumDigits(n)); 
    }
    public static int sumDigits(long n){ 
        int total = 0;  
        int count = 0;
        count = getDigitOfNumber(n);
        for(int i=1; i<=count; i++){
            long v = n%10; 
            total += v; 
            n /= 10;  
        }
        return total;
    }
    public static int getDigitOfNumber(long n){ 
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
	}
}
