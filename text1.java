public class Students {
	final String name="����";   //final����name����
	public void introduce() {
		System.out.println("����һ��ѧ�����ҽ�"+name);
	}

}

public class Example07 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Students stu = new Students();  //����ѧ�����ʵ������
		stu.introduce();           //����Students��introduce����

	}

}