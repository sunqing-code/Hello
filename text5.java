interface Animal {  //����Animal�ӿ�
	void shout();

}

public class Cat implements Animal {    //����cat��ʵ��animal�ӿ�
	public void shout() {                //ʵ��shout����
		System.out.println("��������");
	}
	void sleep() {                     //����sleep��������
		System.out.println("è��˯��");
	}

}

public class Example06 {

	public static void main(String[] args) {
		Cat cat=new Cat();
		animalShout(cat);

	}
	public static void animalShout(Animal animal){
		Cat cat =(Cat) animal;     //��animalǿתΪcat����
		cat.shout();               //����cat��shout����
		cat.sleep();              //����cat��sleep����
		//animal.shout();
		//animal.sleep();    ������ʾû��animal.sleep()����
	}

}


4-15

interface Animal {  //����Animal�ӿ�
	void shout();

}

class Dog implements Animal {  
	public void shout() {     
		System.out.println("����������");
	}
}


public class Cat implements Animal {    //����cat��ʵ��animal�ӿ�
	public void shout() {                //ʵ��shout����
		System.out.println("��������");
	}
	void sleep() {
		System.out.println("è��˯��");
	}

}

public class Example06 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		animalShout(dog);
	}
	public static void animalShout(Animal animal){
		if(animal instanceof Cat) {     //�ж�animal�Ƿ���cat���ʵ������
		Cat cat =(Cat)animal;     //��animalǿתΪcat����
		cat.shout();               //����cat��shout����
		cat.sleep();    //����cat��sleep����
		} else {
			System.out.println("this animal is not a cat");
		}
	}

}