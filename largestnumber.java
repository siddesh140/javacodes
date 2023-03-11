package myproject1;
	import java.util.*;
public class largestnumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the three numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int A,B,C,big=0;
		if(a>b) {
			if(a>c)
				System.out.println("a is large number"+big);
			else 
				System.out.println("c is large number"+big);
			
		}
		else {
			if(b>c)
				System.out.println("b is large"+big);
			else
				System.out.println("c is large"+big);
		}
//		System.out.println("big value is"+big);
		

	}

}
