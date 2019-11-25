package dianxinjifei;

public class TelcomAccountSystem {
	public static void main(String[] args){
		TelcomUser telcomUser = new TelcomUser("15837201068");
		telcomUser.generateCommunicateRecord();
		telcomUser.printDetails();
	}

}
