import java.util.Scanner;


public class Quadratic {
		
	static double [] solve(double a, double b, double c) {
		double x1, x2;
		double [] result = new double[2];
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phuong trinh co vo so nghiem");
				} else {
					System.out.println("Phuong trinh vo nghiem");
				}
			} else {
				double x = -b/c;
				System.out.println("Phuong trinh co 1 nghiem duy nhat" + x);
			}
		}else {
			double delta = b*b - 4*a*c;
			if(delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			if(delta == 0) {
				x1 = x2 = -b/(2*a);
				System.out.println("Phuong trinh co nghiem kep: " +x1);

				result[0] = x1;
		        result[1] = x2;
			}
			if(delta > 0) {
				x1 =(-b+Math.sqrt(delta))/(2*a);
		        x2 =(-b-Math.sqrt(delta))/(2*a);

				result[0] = x1;
		        result[1] = x2;
			}
			
		}
		return result;
	}
	
}
