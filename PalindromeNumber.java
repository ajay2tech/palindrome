import java.util.Scanner;
class PalindromeNumber 
{
	public static void main(String[] args) 
	{    
		int n;
		int temp,rem,rev=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the no");
           n=scan.nextInt();
		   temp=n;
		   while(temp!=0)
		{
			   rem=temp%10;
			   rev=rev*10+rem;
			   temp=temp/10;
		}
		  if(rev==n)
		{
			System.out.println(n+ "is palindrome");
		}
		else
		{
					System.out.println(n+ "is not palindrome");
		}

	}
}
