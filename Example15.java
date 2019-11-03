class Storage{
	private int [] cells = new int  [10];
	private int inpos,outpos;
	private int count;
	public synchronized void put (int num ){
		try{
		while (count==cells.length){
			this.wait();
		}
		cells[inpos]=num;
		System.out.println("��cells["+inpos+"]�з�������---"+cells[inpos]);
		inpos++;
		if (inpos==cells.length)
			inpos=0;
		count++;
		this.notify();
	}catch (Exception e){
		e.printStackTrace();
	}
}
 public  synchronized void get  (){
	 try{
	 while (count==0) {
		 this.wait();
	 } 
	 int data = cells[outpos];
	 System.out.println("��cells["+outpos+"]��ȡ������---"+data);
	 cells[outpos]=0;
	 outpos++;
	 if(outpos==cells.length)
		 outpos=0;
	 count--;
	 this.notify();
} catch (Exception e){
	e.printStackTrace();
}

 }

 }
class Input implements Runnable {
	   private Storage st;
	   private int num;
	   Input (Storage st){
		   this.st=st;
	   }
	   public void run (){
		   while (true){
			   st.put(num++);
		   }
	   }
}
class Output implements Runnable {
	private Storage st;
	
	Output (Storage st ){
		this.st =st ;
	}   
	public void run (){
		while (true ){
			st.get();
		}
	}
}
public class Example15{
	 public static void main (String [] args){
     Storage st =new Storage ();
     Input input =new Input (st);
     Output output =new Output(st);
     new Thread(input).start();
     new Thread(output).start();
}
}
