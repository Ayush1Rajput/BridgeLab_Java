import java.util.*;

class PowerCalculation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the value of a : ");
		int a = sc.nextInt();
		System.out.print("Input the value of b : ");
		int b = sc.nextInt();
		int power = Math.pow(a,b);
		System.out.print("The power of "+a+"^"+b+ " is : " +power); 
	}
}
