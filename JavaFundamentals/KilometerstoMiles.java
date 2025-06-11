import java.util.*;

class KilometerstoMiles{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the Kilometers : ");
		float km = sc.nextFloat();
		float miles = km*0.621371;
		System.out.print("The distance in miles is : " + miles); 
	}
}
