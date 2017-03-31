package example;
import java.io.BufferedReader;

import example.matrix;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class mainprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileWriter fw = new FileWriter("output.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
		
		{
			try {
				BufferedReader br = new BufferedReader(new FileReader("input.txt"));
			    String line = "";
			    while (line != null) {
			        line = br.readLine();
			        int n = Integer.parseInt(line);
				  
				    matrix m = new matrix(n);
					
					out.println("M = ");
					out.println(m);
					
					double det = m.determinant();
					out.println("det(M) = " + det + "\n");
					
					if (det != 0)
					{
						matrix inv = m.inverse();

						out.println("Minv= \n " + inv);
					}
			    }
			    br.close();
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
			finally{
				
			}
			
		} catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}

	}

}
