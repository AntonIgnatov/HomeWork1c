package net.bigmir.venzor;

public class Main {

	public static void main(String[] args) {
		Vector3d a= new Vector3d(1, 2, 3);
		Vector3d b=new Vector3d(1.5, 6, 5.8);
		Vector3d s=Vector3d.vectSum(a, b);
		System.out.println("Sum of vectors a and b: c"+s.toString());
		double scal=Vector3d.scalar(a, b);
		System.out.println("Scalar multiplication of vectors a and b =  "+scal);
		Vector3d v = Vector3d.vectProizv(a, b);
		System.out.println("Vector multiplication of vectors a and b: c"+v.toString());
		
		

	}

	

}
