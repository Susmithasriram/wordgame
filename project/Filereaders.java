package project;
import java.io.*;

import java.util.*;

public class Filereaders {
	
//	public static words String[] = {"wordsfile.txt"};
	
			public  static void main(String[] args) throws IOException{
				BufferedReader bufReader = new BufferedReader(new FileReader("wordsfile.txt")); 
				ArrayList<String> listOfLines = new ArrayList<>();
				String line = bufReader.readLine();
//				Scanner scan = new Scanner(System.in);
//				int flag = 0,l;
				System.out.println(line);
//				while(flag == 0){
//					
				//}
				
			}
//				FileReader word =  new FileReader("wordsfile.txt");
//				
//				ArrayList<String> Words = new ArrayList<String>();
//				  Words = word("wordsfile.txt");
//				try{
//					throw new IOException();
//				}catch(IOException e){
////		          System.out.println("User entered the wrong word");
//				}
//}

private static ArrayList<String> word(String string) {
	// TODO Auto-generated method stub
	return null;
}
				
	}

