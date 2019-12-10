package yinhang;

import java.util.Scanner;

public class Bank {
	int account;
	private static User user;
	
	public static void main(String[] args){
		Bank b = new Bank();
		b.login();
		b.operate();
	}
	
	/*�˻������롢ȡ���Ͳ�ѯ����*/
	public void operate(){
		Bank b = new Bank();
		while (true){
			System.out.println("��������Ҫ���еĲ������ͣ����س�������");
			System.out.println("��1"+"\t"+"ȡ�2"+"\t"+"��3"+"\t"+"�˳���0");
			Scanner in = new Scanner(System.in);
			String s = in.nextLine(); //����Ĳ�������
			if("1".equals(s)||"2".equals(s)){
				int num = 0;
				try{
					System.out.print("�����ȡ�Ľ��:");
					num = Integer.parseInt(in.nextLine());
				}catch(Exception e){
					System.out.println("����������");
					continue;
				}
				switch(s){
				case "1"://������
					b.income(num);
					break;
				case "2"://ȡ�����
					b.takeout(num);
					break;
				}
			}else if("3".equals(s)){
				b.show();
			}else if("0".equals(s)){
				System.out.println("�˳�ϵͳ");
				return;	
			}else{
				System.out.println("������0-3֮�������ѡ����ز�����");
			}
		}
	}
	/*�û���¼��������*/
	public void login(){
		DBUtils dbutil = DBUtils.getInstance();
		System.out.println("��ӭʹ����������ϵͳ��");
		while (true){
			Scanner in = new Scanner(System.in);  //����¼��
			System.out.println("���������п��ţ�");
			String cardId = in.nextLine();
			System.out.println("���������п����룺");
			String cardPwd = in.nextLine();
			user = dbutil.getUser(cardId);
			//��¼
			if(dbutil.getUsers().containsKey(cardId)
					&& user.getCardPwd().equals(cardPwd)){
				System.out.println("��¼�ɹ�����ӭ"+ user.getUserName()+"����");
				break;
			}else{
				System.out.println("���п��Ż��������!");
				continue;
			}
			
		}
	}
	public void income(int num) {
		account=user.getAccount()+num;
		user.setAccount(account);
		System.out.println("������"+num+"Ԫ�ɹ���");
		
	}
	public void takeout(int num) {
		if(user.getAccount()>=num) {
		account=user.getAccount()-num;
		user.setAccount(account);
		System.out.println("ȡ�����"+num+"Ԫ�ɹ���");
		}else {
			System.err.println("���㣬ȡ��ʧ�ܣ�");
		}
		
	}
	public void show() {
		account=user.getAccount();
		System.out.println("�˻��ܶ�Ϊ"+account+"Ԫ");
	}

}
