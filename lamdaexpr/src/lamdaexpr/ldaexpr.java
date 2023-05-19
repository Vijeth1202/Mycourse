package lamdaexpr;

 
public class ldaexpr {

	public static void main(String[] args) {
	expe obj=()->System.out.println("Hello vijeth");
	obj.disp();
	
	demo d = num1-> num1+5;
	System.out.println(d.add(10));
//		expe s=new expe() {
//				public void disp()
//				{
//					System.out.println("hELLO k D");
//				}
//		
//		public int mul(int a, int b) { int c;
//			 c=a+b;
//			 System.out.println(c);
//			return c;
//		}};
//		obj.disp();
//		s.mul(10, 5);
	}

}
