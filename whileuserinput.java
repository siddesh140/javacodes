
package myproject1;
import java.util.*;
public class whileuserinput {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		System.out.println("enter the range : ");
		int a = in.nextInt();
		int i=a;
		while(i<=1000) {
			System.out.println(i);
			i++;
		}
	}

}