import java.util.Scanner;

class CelsiustoFahrenheit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the  temprature in celcius : ");
		float temp = sc.nextFloat();
		float Fahrenheit = (temp * 9/5) + 32;
		System.out.print("Temprature in Fahrenheit is : "+Fahrenheit);
	}
}
