package dijiuzhou;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Find {
	public static void find() {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("������Ҫ���ҵ�ѧ�ţ�");
		String num=sc.nextLine();
		Iterator it=Main.list.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			Student stu1=(Student)obj;
			if(num.equals(stu1.getStudentNum())) {
				System.out.println("��Ҫ����ѧ����Ϣ���£�");
				System.out.println(stu1.toString());
					break;
			}
	}
 }
}
