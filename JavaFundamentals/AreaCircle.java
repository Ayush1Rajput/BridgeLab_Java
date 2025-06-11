import java.util.Scanner;

class AreaCircle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the radius : ");
		int rad = sc.nextInt();
		float area = 3.141* Math.pow(rad,2);
		System.out.print("The  Area of Circle is : "+area);
	}
}
