
public class Tpgm {

	public static void main(String[] args) {
		int n=6;
		
		for(int i=0;i<n;i++)
			
		{
			for(int j=0;j<n;j++)
			{
				if((i==0 && j>0 && j<n/2)||( i==0 && j>n/2 && j<=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");

				}
				if(( j==0 && i>0 && i<n/2)||(j==n-1 && i>0 && i<n/2))
				{
					System.out.print("*");
				}
				
				if(i==1 && j>n/4 && j<=n/2 )
				{
					System.out.print("*");
			    }
				else
				{
					System.out.print(" ");

				}
				if(i==2 && j==(n-1)/2)
				{
					System.out.print("*");
			    }
				else
				{
					System.out.print(" ");

				}
//				if(i==j)
//				{
//					System.out.print("*");
//			    }
				
				
		}
			System.out.println();
		}
       for(int i=n/2;i<n;i++)
			
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
					System.out.print("*");
			}
		}
	}

}
