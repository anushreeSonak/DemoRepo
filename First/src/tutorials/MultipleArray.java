package tutorials;

public class MultipleArray {

	public static void main(String[] args) 
	{
		int a [][]= new int[2][2]; //{{0,9},{5,1,6},{2,2,7}};
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;

		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
			System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}

		int b[][]= {{10,20},{20,30},{20,30}};
		System.out.println(b.length);
		System.out.println(b[0].length);
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<2;j++)
			{
			System.out.print(b[i][j]);
			}
			System.out.println(" ");

	}

	}}
