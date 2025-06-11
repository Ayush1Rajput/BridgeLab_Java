import java.util.*;

class PowerCalculation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int power = Math.pow(a,b);
		System.out.print("The power of "+a+"^"+b+ " is : " +power); 
	}
}
