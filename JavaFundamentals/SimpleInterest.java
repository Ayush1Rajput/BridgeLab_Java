import java.util.Scanner;

class SimpleInterest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float principle = sc.nextFloat();
		float rate = sc.nextFloat();
		float time = sc.nextFloat();
		float simpleIntereset = (principle*rate*time)/100;
		System.out.print("The Simple Interest is : "+simpleIntereset);
	}
}
