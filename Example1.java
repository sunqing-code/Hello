
public class Example1 {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
		System.out.println("main()����������");}
}
class MyThread extends Thread{
	public void run(){
		System.out.println("MyThread���run()����������");
	}
		
		// TODO �Զ����ɵķ������

	

}
