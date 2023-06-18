package project;

	import java.io.*;
	import java.util.*;
	public class MemoryGame   {
	  public void game()throws IOException{
	     FileInputStream fs=new FileInputStream("wordfile.txt");
	     FileOutputStream fo=new FileOutputStream("Game.txt");
	     FileOutputStream ex=new FileOutputStream("example.txt");
	     Scanner sc=new Scanner(System.in);
	     int flag=0,l;
	     int n=0;
	      System.out.println("\n---------------------Game Started--------------------\n");


	                                //computer input
	     
	      while(flag==0){                               
	         System.out.println("computer word");    
	         char[] c=new char[20];
	         int i=0,j=0;
	         boolean b=true;
	         for(;b;i=0){
	             c[i]=(char)fs.read();
	             while(c[i]!='-'){
	                 c[++i]=(char)fs.read();
	             }
	         b=checkcomputer(c,n);                  //checking whether computer word is already in game.txt
	         }
	                          //computer word stored in game.txt          
	                    
	         while(j<c.length){ 
	              System.out.print(c[j]);                      
	              fo.write(c[j++]);
	         }
	         System.out.print("\n");
	         fo.write('\n');
	         n++;         //words count



	                          //player input
	         System.out.println("\nEnter the correct sequence of Words");
	         FileInputStream game=new FileInputStream("game.txt");
	         for(j=0;j<n;j++){
	           String gs=sc.nextLine();
	           char[] ch=new char[20];
	           l=gs.length();
	           int count=0,k=0;
	           ch[k]=(char)game.read();
	            while(ch[k]!='\n'){
	                if(ch[k]>='a' && ch[k]<='z'){
	                   System.out.print(ch[k++]);
	                }  
	                ch[k]=(char)game.read();
	             }
	              System.out.print("\n");
	             int m=0;
	                    while(m<l && gs.charAt(m)==ch[m]){
	                           count++;
	                            m++;
	                    }
	                    if(l==0 || count!=l){
	                          System.out.println("\nyou entered wrong word");
	                          flag=1;
	                          break;
	                    }
	                    else{System.out.println("\nyou entered right word");}
	           }

	     
	                    // after successful sequence player input 
	         if(flag==0){       
	            System.out.println("\nEnter Your Word");
	            String s=sc.nextLine();
	            boolean g=check(s,n);
	            if(g){
	            char[] w=new char[s.length()];
	            for(int r=0;r<s.length();r++){
	              w[r]=s.charAt(r);
	              fo.write(w[r]);
	              ex.write(w[r]);
	            }     
	            fo.write('\n');
	            n++;
	            ex.write('-');}
	           else{flag=1;}
	                   
	         }
	     }
	     System.out.print("-------------------------Game End-------------------------");
	                                      
	                                        // wordsfile changing
	     fo.flush();
	     fs.close();
	     fo.close();
	     FileInputStream fs1=new FileInputStream("wordsfile.txt");
	     char ch='a';
	     ch=(char)fs1.read();
	     while(ch!='#'){
	         ex.write(ch);
	         ch=(char)fs1.read();
	     }
	     ex.write('#');
	     FileInputStream es=new FileInputStream("example.txt");
	     FileOutputStream fo1=new FileOutputStream("wordsfile.txt");
	     ch=(char)es.read();
	     while(ch!='#'){
	         fo1.write(ch);
	         ch=(char)es.read();
	     }
	     fo1.write('#');
	     fs1.close();
	     fo1.close();
	     es.close();
	     ex.close();
	   }
	                         // checking whether player word is already in game or not

	   public static boolean check(String s,int n)throws IOException{ 
	      Scanner sc=new Scanner(System.in);
	      FileInputStream game1=new FileInputStream("game.txt");
	      int i=0,j=0,l=0;
	      while(i<=n){
	           char[] ct=new char[20];
	           ct[j]=(char)game1.read();
	           while(ct[j]!='-' && ct[j]!='\n'){
	                  //System.out.print(ct[j]);
	                  ct[++j]=(char)game1.read();        
	           }
	           l=s.length();
	               for(j=0;j<l && ct[j]==s.charAt(j);j++);
	               if(l==j){
	                  System.out.println("This word is already exist,You failed");
	                   return false;
	                  }
	           i++;
	      }
	      game1.close();
	      return true;
	   }
	                 // checking whether computer word is already in game or not
	      
	   public static boolean checkcomputer(char[] c,int n) throws IOException{
	       FileInputStream game2=new FileInputStream("game.txt");
	      int i=0,j=0,l=0,l1=0,k=0;
	      if(n==0){return false;}
	      while(i<=n){
	           char[] ct=new char[20];
	           j=0;
	           ct[j]=(char)game2.read();
	           while(ct[j]!='-' && ct[j]!='\n'){
	                  ct[++j]=(char)game2.read();        
	           }
	               for(k=0;k<j && ct[k]==c[k];k++);
	               if(k==j){
	                   return true;
	                  }
	           i++;
	      }
	      game2.close();
	      return false;
	   }
	}


