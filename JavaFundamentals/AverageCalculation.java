import java.util.*;

class AverageCalculation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the  1st number : ");
		int a = sc.nextInt();
		System.out.print("Input the  2nd number : ");
		int b = sc.nextInt();
		System.out.print("Input the  3rd number : ");
		int c = sc.nextInt();
		float avg = (a+b+c)/3;
		System.out.print("The average of 3 numbers is " + avg); 
	}
}
