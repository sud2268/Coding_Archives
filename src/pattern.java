import java.util.*;

public class pattern {
	public static void main(String args[]) {
		int n = 7;
		int x = n / 2;
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < n; j++) {
				//if (i <= x)
				{
					if (j <= (x - i) || j >= (x + i))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		for (int i = x; i <n; i++)
		{
			int tem=n-i-1;
			for (int j = 0; j < n; j++) {
				//if (i < x)
				{
					if (j <=(x - tem) || j >= (x +tem))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}

		