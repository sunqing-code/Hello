
public class Example1 {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
		System.out.println("main()方法在运行");}
}
class MyThread extends Thread{
	public void run(){
		System.out.println("MyThread类的run()方法在运行");
	}
		
		// TODO 自动生成的方法存根

	

}
