import java.util.Scanner;

class CylinderVolume{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float rad = sc.nextFloat();
		float height = sc.nextFloat();
		float vol = 3.141* Math.pow(rad,2)*height;
		System.out.print("The Volume of Cylinder is : "+vol);
	}
}
