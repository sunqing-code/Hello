package dijiuzhou;

import java.util.*;

public class Delete {
	public static void delete() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫɾ����ѧ��ѧ�ţ�");
		String num=sc.nextLine();
		for(int i=0;i<Main.list.size();i++){
			Student stu1=(Student)Main.list.get(i);
			if(num.equals(stu1.getStudentNum())) {
				System.out.println("��Ҫɾ��ѧ����Ϣ���£�");
				System.out.println(stu1.toString());
				Thread.sleep(1000);
				System.err.println("ȷ��ɾ��������\nYes   No");
				String hd=sc.nextLine();
				if(hd.equals("Yes")) {
					Main.list.remove(i);
					System.out.println("��ɾ��");
				}
			}
		
		}
		
	}

}
