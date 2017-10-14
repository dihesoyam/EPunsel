package vares;
import java.io.*;

public class Line {
	public static String lines[] = {"dd","fff","dg"};

	public static void addNewLine(String str){
		String noStr;
		try{
			noStr = str;
			
			FileWriter line = new FileWriter("text.bk");
			
		/*TODO*/	for(String fst : lines){
			line.write(fst+"\n");
			}
			
			//line.append('\n');
			line.flush();
			line.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public static String getLine(int t){
		return lines[t];
	}

	 
}

