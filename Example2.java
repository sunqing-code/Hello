
public class Example2 {
	public static void main(String[] args){
	MyThread myThread=new MyThread();
	Thread thread=new Thread(myThread);
	thread.start();
	while(true){
		System.out.println("main()�����ڽ���");
	}
}}
class MyThread implements Runnable{
	public void run(){
		while (true){
			System.out.println("MyThread���run()");
		}
	}
}
