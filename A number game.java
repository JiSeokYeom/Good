import java.util.Scanner;
import java.util.Random;
public class daaaa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int k = r.nextInt(100);
		System.out.println("I've determined the number. Guess what.");
		System.out.println("0~99");
		int a =0;
		while(true)
		{
			for(int i = 1 ; ;i++)
			{
				System.out.print(i + "Attempt>>>");
				a = s.nextInt();
				if(a<k)
				{
					System.out.println("Higher");
				}
				else if(a>k)
				{
					System.out.println("Lower");
				}
				else if(a==k)
				{
					System.out.println("Amazing" + i + "You've hit the mark.");
					break;
				}
			}
			System.out.println("Would you like to try again? (y/n)>>");
			if(s.next().equals("n"))
			{
				break;
			}
			else
			{
				k=r.nextInt(100);
				continue;
			}
		}
				
		s.close();
	}

}
