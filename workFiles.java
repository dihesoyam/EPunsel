package vares;
import java.io.*;
import java.util.Scanner;

public class workFiles {
	public static void getFile(){
		
		try {
			
			FileWriter base = new FileWriter("EPunsel.txt");
			System.out.println("File is created!");
			base.write("Hello, "+basic.nameP+"\n");
			base.write("Hello, "+basic.names[2]);
			base.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		
		public static void readF() throws IOException{
		 FileReader fr= new FileReader("EPunsel.txt");
	        Scanner scan = new Scanner(fr);
	            
	        int i = 1;
	        while (scan.hasNextLine()) {
	            System.out.println(i + " : " + scan.nextLine());
	            i++;
	        }
	 
	        fr.close();
	        scan.close();
		}
		
	
}
