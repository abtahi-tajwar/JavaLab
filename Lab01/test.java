import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{		
		System.out.println(sum(3,4));
		System.out.println(subs(100, 200));
		System.out.println(summation(999));
		System.out.println(Reversing(456123789));
		System.out.println(checkArmstrong(370));
		System.out.println(checkArmstrong(373));
		System.out.println(checkPalindrome(121));
		System.out.println(checkPalindrome(122));
	}
	public static int sum(int a, int b)
	{
		return a+b;
	}
	public static int subs(int a, int b)
	{
		return a-b;
	}
	public static int summation(int number)
	{
		int total = 0;
		int digit = 0;
		while(true)
		{
			digit = number%10;
			total += digit;
			if(number/10 < 1) break;
			number /= 10;
			
		}
		return total;
	}
	public static int Reversing(int number)
	{
		int num = 0;
		int digit = 0;
		while(true)
		{
			digit = number%10;
			num = num*10 + digit;
			if(number/10 < 1) break;
			number /= 10;
			
		}
		return num;
	}
	public static boolean checkArmstrong(int number)
	{
		int digit = 0;
		int total = 0;
		int per = number;
		while(true)
		{
			digit = number%10;
			total += digit*digit*digit;
			if(number/10 < 1) break;
			number /= 10;
			
		}
		if(total == per){ return true; }
		else{ return false; }
	}
	public static boolean checkPalindrome(int number)
	{
		int reversed = Reversing(number);
		if(reversed == number) return true;
		else return false;
	}
}