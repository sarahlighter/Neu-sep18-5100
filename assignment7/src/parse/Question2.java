package parse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Question2 {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\wxr\\Desktop\\abc.txt");
		parse(file);
	}
	public static void parse(File file){
		 RandomAccessFile input = null;
		 String line = null;
		 try {
			 input = new RandomAccessFile(file, "r");
			 while ((line = input.readLine()) != null) {
				 System.out.println(line);
		      }
		      return;
		 } catch (FileNotFoundException e) {
		   e.printStackTrace();
		 } catch (IOException e) {			
			e.printStackTrace();
		 } finally {
		     if (input != null) {
		         try {
		        	 input.close();
		         } catch (IOException e) {
					 e.printStackTrace();
		         }
		    }
		 }
	}
}