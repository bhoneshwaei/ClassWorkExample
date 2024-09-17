package pattern;

public class StarPatternLeft {

	public static void main(String[] args) {
	
		int row = 5;
		for(int i= 1;i<=row;i++)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

