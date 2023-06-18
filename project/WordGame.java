package project;

import java.io.IOException;
import java.util.*;

public class WordGame {

	public static void main(String[] args) throws IOException {
	
		User temp = new User();
		int n = 0;
		String p = " "; 
		
		System.out.println("-------PLAYRIX--------");
		do{
		System.out.println("1. Create the username");
		System.out.println("2. User details");
		System.out.println("3. Start the game");
		System.out.println("4. Exit");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		
		if( n == 1){
		
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Username");
			String username = scan1.next();
			UserDetails temp1 = new UserDetails(n, username);
		    temp.addUser(temp1);
			System.out.println("Add");
			
		}
		if(n==2){
			UserDetails[] det = temp.getUsers();
			int G = User.getCount();
			if(G==0)
				System.out.println("invalid UserDetails");
			for(int g = 0; g<G; g++){
				System.out.println(det[g]);
			}
		}
		if(n == 3) {
			UserDetails[] det = temp.getUsers();
			int G = User.getCount();
			if(G==0)
				System.out.println("invalid UserDetails");
			for(int g = 0; g<G; g++){
				System.out.println(det[g]);
			}
			MemoryGame game1 = new MemoryGame();
			game1.game();
		}
		
     if(n==4){
    	 System.exit(0);
     }
		}while(n > 0 && n <=4);
	}

}
