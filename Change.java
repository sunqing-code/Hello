package dijiuzhou;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Change {
	public static void change() {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ҫ�޸�ѧ��ѧ�ţ�");
		String num=sc.nextLine();
		Iterator it=Main.list.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			Student stu1=(Student)obj;
			if(num.equals(stu1.getStudentNum())) {
				System.out.println("������Ҫ�޸�ѧ��ѧ�ţ�");
				String Num=sc.nextLine();
				stu1.setStudentNum(Num);
				System.out.println("������Ҫ�޸�ѧ��������");
				String name=sc.nextLine();
				stu1.setStudentName(name);
				System.out.println("������Ҫ�޸�ѧ���Ա�");
				String gender=sc.nextLine();
				stu1.setStudentgender(gender);
	         }
		}	
  }
}
