package yinhang;

import java.util.HashMap;

public class DBUtils {
	private static DBUtils instance = null;
	private HashMap<String,User> users = new HashMap<String,User>();
	
	private DBUtils(){
		
		User u1 = new User();
		u1.setCardId("1111111111");
		u1.setCardPwd("111111");
		u1.setUserName("张老大");
		u1.setCall("11111111111");
		u1.setAccount(10000);
		users.put(u1.getCardId(), u1);
		
		User u2 = new User();
		u2.setCardId("2222222222");
		u2.setCardPwd("222222");
		u2.setUserName("李老二");
		u2.setCall("22222222222");
		u2.setAccount(20000);
		users.put(u2.getCardId(), u2);
		
		User u3 = new User();
		u3.setCardId("3333333333");
		u3.setCardPwd("333333");
		u3.setUserName("王老三");
		u3.setCall("33333333333");
		u3.setAccount(30000);
		users.put(u3.getCardId(), u3);
	}
	public static DBUtils getInstance(){
		if(instance ==null){
			synchronized(DBUtils.class){
				if(instance == null){
					instance = new DBUtils();
				}
			}
		}
		return instance;
	}
	public User getUser(String cardId){
		User user = (User)users.get(cardId);
		return user;
	}
	public HashMap<String,User>getUsers(){
		return users;
	}
}
