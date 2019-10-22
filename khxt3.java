class Teacher implements Runnable{
		private int notes=80;
		public void run(){
		while (true){
		dispatchNotes();
		if(notes <=0){
		break;
		}
		}
		}
		private synchronized void dispatchNotes(){
		if(notes>0){
		try{
		Thread.sleep(10);
		}
		catch (InterruptedException e){
		e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"---发出的笔记"+notes--);
		}
		}
		}

class khxt3{
		public static void main(String[] args){
		Teacher t=new Teacher();
		new Thread(t,"王老师").start();
		new Thread(t,"黄老师").start();
		new Thread(t,"胡老师").start();
		}
		}