
	public class zuoye4{
       public static void main(String[] args) {
			Taxi t=new Taxi();
			new Thread(t,"���⳵1").start();
			new Thread(t,"���⳵2").start();
			new Thread(t,"���⳵3").start();
			new Thread(t,"���⳵4").start();
			new Thread(t,"���⳵5").start();
			// TODO Auto-generated method stub

}}
class Taxi implements Runnable{
		private int passenger=100;
		public void run(){
			while(true){
				if(passenger>0){
					Thread t=Thread.currentThread();
					String t_name=t.getName();
					System.out.println(t_name+"���ڽ��͵�"+passenger--+"λ�˿�");
				}
			}
		}
	}