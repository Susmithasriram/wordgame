package project;

public class UserDetails {
	private int GameID;
	protected String Username;
	static int count = 5078930;
	public UserDetails(){
		
	}
	
	public UserDetails(int gameID, String username) {
		GameID = ++count;
		Username = username;
	}
	
	public static int getCount(){
		return count;
	}
	public int getGameID() {
		return GameID;
	}
	public void setGameID(int gameID) {
		GameID = gameID;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	
	public void printDetails(){
		System.out.println("GameID = " + GameID);
		System.out.println("Username = " + Username);
	}
	public String toString() {
		return "UserDetails [GameID=" + GameID + ", Username=" + Username + "]";
	}

}
