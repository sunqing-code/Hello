package dijiuzhou;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int count;
	static ArrayList list=new ArrayList();
	public static void main(String[] args) throws InterruptedException 
	 {
		
		Student stu=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("��ӭʹ��ѧ������ϵͳ!");
		Thread.sleep(200);
		while(true) {
		System.out.println("1-���ѧ��");
		System.out.println("2-ɾ��ѧ��");
		System.out.println("3-�޸���Ϣ");
		System.out.println("4-��ѯѧ��");
		System.out.println("5-��      ��");
		
		System.out.println("���������ѡ��");
		int choice=sc.nextInt();
		if(choice==5)
			break;
		else {
			switch(choice) {
			case 1:Add.add();break;
			case 2:Delete.delete();break;
			case 3:Change.change();break;
			case 4:Find.find();break;
			}
			
		}
		
		}
	}

}
