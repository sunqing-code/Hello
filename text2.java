abstract class Animal {  //���������
	abstract void shout();  //������󷽷�

}

public class Dog extends Animal {

	void shout() {		//ʵ�ֳ��󷽷�
		System.out.println("����������");
	}
}
import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();
		Dog dog=new Dog();
		dog.shout();

	}

}
0 comments on commit 7997e22