package dijiuzhou;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Add {
	static int count;
	public static void add() {
		Student stu=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("������ѧ��ѧ�ţ�");
		String num=sc.nextLine();
		stu.setStudentNum(num);
		System.out.println("������ѧ��������");
		String name=sc.nextLine();
		stu.setStudentName(name);
		System.out.println("������ѧ���Ա�");
		String gender=sc.nextLine();
		stu.setStudentgender(gender);
		Main.list.add(count,stu);
		System.err.println("\t��ӳɹ���\n");
		count++;
		
     }
}
