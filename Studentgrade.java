package myproject1;
	import java.util.*;
public class Studentgrade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please, Enter your subject marks : ");
	
		int p1 = in.nextInt();
		int p2 = in.nextInt();
		int p3 = in.nextInt();
		
		System.out.println("plzz, Enter your gender :");
		String gender = in.next();
		int total=p1+p2+p3;
		int per=total/3;
		
		if(per>=62 && gender.equals("female")){
			System.out.println("you can take take admission");
		}
		else {
			System.out.println("you cannot take any admision");
		}
	}
	}
