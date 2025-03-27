package day6program;
import java.io.*;
public class prg3program {
		public static void main (String[] args) {
			//BufferedReader program
//			try {
//				BufferedReader r1= new BufferedReader(new FileReader("D:\\Test\\sample.txt"));
//				String line;
//				System.out.println("Reading file line by line:");
//				while ((line = r1.readLine()) != null) {
//					System.out.println(line);
//				}
//				r1.close();
//			}catch (IOException e) {
//				System.out.println("Error Reading file:" + e.getMessage());
//			}
			//BufferedWwriter program
			try {
				BufferedWriter writer =new BufferedWriter(new FileWriter("D:\\Test\\sample.txt"));
				writer.write("Java File handling Example");
				writer.newLine();
				writer.write("BufferedWriter makes writing more sfficient");
				writer.close();
				System.out.println("data written to file Successfully");
			}catch(IOException e) {

				System.out.println("Error writing to file:" +e.getMessage());
			}
		}
}