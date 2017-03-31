package example;

public class matrix {
	private int n = 10;
	private final static int MaxSize = 10;
	public double mdata[][] = new double[MaxSize][MaxSize];
	
	public matrix(int m){
		n = m;
	}
	// Determinant method for matrix
	public double determinant(){
		double det = 0.0;
		
		if (n == 1)
		{
			det = mdata[0][0];
		}
		else if (n == 2)
		{
			det = mdata[0][0] * mdata[1][1] - mdata[0][1] * mdata[1][0];
		}
		else
		{
			for (int i = 0; i < n; i++)
			{
				det += Math.pow(-1.0, (double)i) * mdata[0][i] * subMatrix(0, i).determinant();
			}
		}
		
		return det;
	}
	//Inverse method for matrix
	public matrix inverse(){
		matrix inv = new matrix(n);
		double det = determinant();
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				inv.mdata[i][j] = Math.pow(-1.0, (double)i + j) * subMatrix(j, i).determinant() / det;
			}
		}
		return inv;
	}
	//Submatrix method for matrix
	public matrix subMatrix (int r, int c){
		matrix sub = new matrix(n - 1);
		int row = 0; 
		for (int i = 0; i < n; i++)
		{
			if (i == r) continue;
			
			int col = 0;
			for (int j = 0; j < n; j++)
			{
				if (j == c) continue;
				
				sub.mdata[row][col] = mdata[i][j];
				col++;
			}
			
			row++;
		}
		return sub;
	}
	//String method for matrix to print out matrix
	public String toString(){
		String sm = "";
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				sm += mdata[i][j] + " ";
			}
			sm += "\n";
		}
		return sm;
	}
}