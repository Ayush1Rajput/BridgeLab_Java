import java.util.Scanner;

class CylinderVolume{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);		
		System.out.print("Input the radius : ");
		float rad = sc.nextFloat();
		System.out.print("Input the height : ");
		float height = sc.nextFloat();
		float vol = 3.141* Math.pow(rad,2)*height;
		System.out.print("The Volume of Cylinder is : "+vol);
	}
}
