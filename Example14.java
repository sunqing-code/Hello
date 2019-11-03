public class Example14 {

	public static void main(String[] args) {
		DeadLockThread d1=new DeadLockThread(true);
		DeadLockThread d2=new DeadLockThread(false);
		new Thread(d1,"Chinese").start();
//		try{
//			Thread.sleep(500);
//		}catch(InterruptedException e){
//			e.printStackTrace();
//		}
		new Thread(d2,"American").start();
	}

}
class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	DeadLockThread (boolean flag){
		this.flag=flag;
	}
	public void run(){
		if(flag){
			while(true){
				synchronized(chopsticks){
					System.out.println(Thread.currentThread().getName()+"---if--chopsticks");
					synchronized(knifeAndFork){
						System.out.println(Thread.currentThread().getName()+"---if---knifeAndForks");
					}
				}
			}
		}else{
			while(true){
				synchronized(knifeAndFork){
					System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
					synchronized(chopsticks){
						System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
					}
				}
			}
		}
	}
}