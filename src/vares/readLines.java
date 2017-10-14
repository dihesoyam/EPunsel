package vares;
import java.util.Scanner;
import java.io.*;

public class readLines {
public static void read() throws IOException{
	FileReader FLine = new FileReader("text.bk");
	Scanner fScan  = new Scanner(FLine);
	
	
	while(fScan.hasNextLine()){
		System.out.println(fScan.nextLine());
	}
	FLine.close();
	fScan.close();
}
}
