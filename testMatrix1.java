package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMatrix1 {
	@Test
	public void testDeterminant() {
		//create matrixarray
		double[][] matrix = new double[3][3];
		matrix[0][0]  = 5;
		matrix[0][1]  = 4;
		matrix[0][2]  = 3;
		matrix[1][0]  = 6;
		matrix[1][1]  = 9;
		matrix[1][2]  = 1;
		matrix[2][0]  = 2;
		matrix[2][1]  = 5;
		matrix[2][2]  = 3;
		
		//convert matrix array to matrix object
		matrix m = new matrix(3);
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				m.mdata[i][j] = matrix[i][j];
			}
		}
		//Check test case
		assertEquals(82.0, m.determinant(), .001);
	}
	@Test
	public void testSubMatrix() {
		//Create matrix array
		double[][] matrix = new double[3][3];
		matrix[0][0]  = 8;
		matrix[0][1]  = 9;
		matrix[0][2]  = 1;
		matrix[1][0]  = 3;
		matrix[1][1]  = 5;
		matrix[1][2]  = 2;
		matrix[2][0]  = -2;
		matrix[2][1]  = 3;
		matrix[2][2]  = -1;
		
		//copy matrix array to matrix object
		matrix m = new matrix(3);
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				m.mdata[i][j] = matrix[i][j];
			}
		}
		//Check if submatrix works.
		assertTrue("9.0 1.0 \n5.0 3.0" == m.subMatrix(0,0).toString());
	}
	@Test
	public void testInverse() {
		//Create matrix array
		double[][] matrix = new double[3][3];
		matrix[0][0]  = 8;
		matrix[0][1]  = 9;
		matrix[0][2]  = 1;
		matrix[1][0]  = 3;
		matrix[1][1]  = 5;
		matrix[1][2]  = 2;
		matrix[2][0]  = -2;
		matrix[2][1]  = 3;
		matrix[2][2]  = -1;
		
		//create matrix object and enter matrix array to object
		matrix m = new matrix(3);
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				m.mdata[i][j] = matrix[i][j];
			}
		}
		//Check if inverse is working
		assertTrue("0.14102564102564102 -0.15384615384615385 -0.16666666666666666 \n0.01282051282051282 0.07692307692307693 0.16666666666666666\n-0.24358974358974358 0.5384615384615384 -0.16666666666666666" == m.inverse().toString());

	}
	
}
