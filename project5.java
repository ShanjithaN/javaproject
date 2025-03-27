package day6program;
import java.io.*;
public class prg2 {
	public static void main(String[] args) {
			try {
				FileWriter w1 = new FileWriter("./output.txt");
				w1.write("hello all");
				w1.close();
				System.out.println("Data Successfully written to file");
			}catch (IOException e) {
				System.out.println("Error writing to the file:" + e.getMessage());
			}
		}
}