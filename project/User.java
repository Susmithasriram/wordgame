package project;

public class User extends UserDetails{

	int username;
	
	 UserDetails[] usernames = new UserDetails[20];  //UserDetails[] usernames = new UserDetails[20];
	public static int count;
	public void addUser(UserDetails newuser) {
		usernames[count++] = newuser;
	}
	public UserDetails getUser() {
		return usernames[count-1];
	}
	public static int getCount() {
		return count;
	}
	public UserDetails[] getUsers() {
		return usernames;
	}
	public UserDetails getUserByID(long ID){
		for(int i = 0; i < getCount(); i++){
		if(ID ==  usernames[i].getGameID()){
			return usernames[i];
		}
	}
		return null;
	
	}
 	
}



