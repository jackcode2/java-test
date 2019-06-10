package huiwen;
import java.util.Scanner;
public class huiwen {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("please enter number:");
           int num=input.nextInt();
if(num/100==num%10)
{
	System.out.println(num+"yes");
}
else
{
	System.out.println(num+"no");
}
}
	}

