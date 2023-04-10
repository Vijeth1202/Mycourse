
public class alphas {

	public static void main(String[] args) {
		int i,j,n=10;
		//B
		for( i=0;i<n;i++)
			
		{
			for(j=0;j<n;j++)
			{
				if((i==(n-1)/2&&j<(n-1)/2)||j==0||(i==0&&j<(n-1)/2&&j>0)||(i==0&&j==0)||(i==n-1&&j<(n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			
		
	//I	

			for(j=0;j<n;j++)
			{
				if(i==0||(j==(n-1)/2)||i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
			}
			
		

//O:

	for(j=0;j<n;j++)
	{
		if((i==n/4&&j>n/4&&j<(3*n)/4)||(j==n/4&&i>n/4&&i<(3*n)/4)||(i==(3*n)/4&&j>n/4&&j<(3*n)/4)||(j==(3*n)/4&&i>n/4&&i<(3*n)/4))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");

		}
	}
	

//G
for(j=0;j<n;j++)
	{
		if((j==n/4&&i>(n-1)/2)||(i==(n-1)/2&&j>n/4&&(j<(n-1)/2)||(j==(n-1)/2&&i<n/4)||(j==(n-1)/2&&i>(n-1)/2)||(i==0 && j>0 &&j<(n-1)/2)||(j==0&&i<n-1)||(i==n-1&&j>0&&j<n/4)))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");

		}
	}
	

//H


	for(j=0;j<n;j++)
	{
		if(j==0||(i==(n-1)/2&&j<(n-1)/2)||j==(n-1)/2)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");

		}
	}
	

	for(j=0;j<n;j++)
	{
		if(j==0||(i==0&&j<(n-1)/2)||(j==(n-1)/2&&i<(n-1)/2&&i>0)||(i==(n-1)/2&&j<(n-1)/2))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");

		}
	}
	System.out.println();
	}
	
}

}	


