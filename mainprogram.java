package example;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class mainprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		try(FileWriter fw = new FileWriter("output.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
		
		{
			try {
				System.out.println("Hello");
				BufferedReader br = new BufferedReader(new FileReader("input.txt"));
				System.out.println("Hello");
			    StringBuilder sb = new StringBuilder();
			    String line = br.readLine();
			    System.out.println("Hello");
			    while (line != null) {
			        sb.append(line);
			        sb.append(System.lineSeparator());
			        line = br.readLine();
			    }
			    
			    String everything = sb.toString();
			    System.out.println(everything);
			    out.println(everything);
			    //Matrix m(n);
				
				//out.println("M = ");
				//out.println(m);
				
				//double det = m.determinant();
				//out.println("det(M) = " + det + "\n");
				
				//if (det != 0)
				//{
					//Matrix inv = m.inverse();

					//out.println("Minv= \n " + inv);
				//}
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
