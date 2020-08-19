import java.util.Scanner;


public class Abuntant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		int n=sc.nextInt();
		int quo[]=new int[n+1];
		for(int i=2;i<=n;i++)
		{
			
			if(n%i==0)
			{
				quo[i]=n/i;
			}
		}
		for(int i=2;i<=n;i++)
		{
			System.out.print(quo[i]+" ");
			sum+=quo[i];
		}
		if(sum>n)
			System.out.print("Abundunt"+sum);
		else
			System.out.print("Not Abundant"+sum);

	}

}
