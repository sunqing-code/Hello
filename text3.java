interface Animal {  //����Animal�ӿ�
	int ID=1;  //����ȫ�ֱ���
	void breathe();   //������󷽷�
	void run();   //������󷽷�

}

interface LabdAnimal extends Animal{   //�ӿڼ̳нӿ�
	void liveOnland();   //������󷽷�

}

class Dog implements Animal {

	public void breathe() {  
		System.out.println("���ٺ���");
	}
	public void run() {
		System.out.println("������");
	}
	public void liveOnland() {
		System.out.println("��������½����");
	}
}
import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();
		Dog dog=new Dog();
		dog.run();
		dog.breathe();
		dog.liveOnland();

	}

}