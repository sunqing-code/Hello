interface Animal {  //����Animal�ӿ�
	void shout();

}

class Dog implements Animal {             //����dog��ʵ��animal�ӿ�
	public void shout() {             //ʵ��shout����
		System.out.println("����������");
	}
}

public class Cat implements Animal {           //����cat��ʵ��animal�ӿ�
	public void shout() {                  //ʵ��shout����
		System.out.println("��������");
	}

}

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();
		Dog dog=new Dog();
		Animal an1=new Cat();
		Animal an2=new Dog();
		animalShout(an1);
		animalShout(an2);
//		dog.run();
//		dog.breathe();
//		dog.liveOnland();

	}
	public static void animalShout(Animal an) {
		an.shout();
	}

}