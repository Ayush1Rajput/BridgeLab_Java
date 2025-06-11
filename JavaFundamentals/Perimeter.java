import java.util.Scanner;

class Perimeter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the length : ");
		float length = sc.nextFloat();
		System.out.print("Input the width : ");
		float widht = sc.nextFloat();
		float perimeter= (length+width)*2;
		System.out.print("The Perimeter of a Rectangle is  : "+perimeter);
	}
}
