package co.edureka.io;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) throws Exception
	{
	  String str = "Edureka is an online training provider with the most effective learning system in the world. We help professionals learn trending technologies for career growth";
	  
	  FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
	  //FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt", true); //true - appending mode
	  
	  byte[] data = str.getBytes(); //to convert String to byte[]
	  fout.write(data);
	  System.out.println("file saved!!!");
	  
	  fout.close();
	  
	  FileWriter fw = new FileWriter("src/co/edureka/io/edureka1.txt");
	  fw.write(str);
	  fw.close();
	  System.out.println("file saved!!!");
	}
}
