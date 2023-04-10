/*Sir due to my own problems I am not be able to do the course as per schedule so please consider
this assignment that I have completed now again sorry for that, I am completely giving my time to the course. With regards Vijeth T M  */
public class pattern {

	public static void main(String[] args) {
			int i,j,n=10;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(j==(n-1)/2&&i==1||j==(n-1)/2&&i>n/4&&i<=n-1 )
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
					if(j==0||j==n-1||i==j)
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
					if(j==n/4||i==0&&j>n/4&&j<(3*n)/4||i==(n-1)/2&&j>n/4&&j<(3*n)/4||i==n-1&&j>n/4&&j<(3*n)/4)
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
					if(j==0&&i!=n-1||i==n-1&&j>0&&j<(n-1)/2||j==(n-1)/2&&i<(n-1))
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
					if(j==0||i==0&&j<(n-1)/2||j==(n-1)/2&&i>0&&i!=(n-1)/2&&i<=n-1||i==(n-1)/2&&j<(n-1)/2)
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
					if(i==0&&j>0&&j<(n-1)/2||j==0&&i>0&&i<n-1||i==n-1&&j>0&&j<(n-1)/2||j==(n-1)/2&&i>0&&i<n-1)
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
					if(j==0||j==n-1||i==j)
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
			System.out.println();
			System.out.println();
//			2. Write a program to print
//			1 1 1 1
//			2 2 2 2
//			3 3 3 3
//			4 4 4 4
			int m=5;
			
			for(i=1;i<m;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
//Home Shape
			
			int x,y,h=15;
			for(x=0;x<h;x++) 
			{
				for(y=0;y<h;y++)
				{
					if(x==0||y==0||y==h-1||x==h-1||x+y<=(h-1)/2||y-x>=(h-1)/2)
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
			System.out.println();
			System.out.println();

//4.Pattern		
			for(x=0;x<h;x++) 
			{
				for(y=0;y<h;y++)
				{
					if(x+y>=h-1+(h-1)/2||x-y>=(h-1)/2)
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
			System.out.println();
			System.out.println();

//5.Pattern		
			for(x=0;x<h;x++) 
			{
				for(y=0;y<h;y++)
				{
					if(x==0||x==h-1||x+y<=(h-1)/2||x-y>=(h-1)/2)
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
