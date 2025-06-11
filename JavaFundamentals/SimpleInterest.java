import java.util.Scanner;

class SimpleInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the principle : ");
		float principle = sc.nextFloat();
		System.out.print("Input the rate : ");
		float rate = sc.nextFloat();
		System.out.print("Input the time : ");
		float time = sc.nextFloat();
		float simpleIntereset = (principle*rate*time)/100;
		System.out.print("The Simple Interest is : "+simpleIntereset);
	}
}
