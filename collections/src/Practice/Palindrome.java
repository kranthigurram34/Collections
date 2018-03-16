 package Practice;

public class Palindrome {

	
		public void method(int n) {
			int number=n;
			int reverse=0;
			int result;
			while(number>0) {
				result=number%10;
				reverse=reverse*10+result;
				number=number/10;
				
			}
			if(reverse==n) {System.out.println("The Given Numbere is Palindrome :" +n);}
		
		else {System.out.println("The Given Numbere is Not a Palindrome :" +n);}
}
	public static void main(String[] args) {
		String str[]= {"1254","4556","75657","8875788"};
		
		int n1=Integer.parseInt(str[0]);
		int n2=Integer.parseInt(str[1]);

		int n3=Integer.parseInt(str[2]);

		int n4=Integer.parseInt(str[3]);
		Palindrome p=new Palindrome();
		p.method(n1);
		p.method(n2);
		p.method(n3);
		p.method(n4);
		

}
}