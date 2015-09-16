import static org.junit.Assert.*;

import java.awt.geom.QuadCurve2D;

import org.junit.Test;


public class QuadraticTest {

	@Test
	public void test() {
		//Test1: Phuong trinh co 2 nghiem phan biet
		double a = 1;
	    double b = -3;
	    double c = 2;
	    double[] expectedResult = {2.0, 1.0}; // x1 and x2
	    double[] result = Quadratic.solve(a, b, c);
	
	    assertArrayEquals( expectedResult, result, 0.0); // make the actual test

		//Test 2: Phuong trinh co nghiem kep
		double[] expectedResult2 = {1.0, 1.0}; // x1 and x2
	    double[] result2 = Quadratic.solve(1.0, -2.0, 1.0);
	    assertArrayEquals( expectedResult2, result2, 0.0); // make the actual test
	}

}
