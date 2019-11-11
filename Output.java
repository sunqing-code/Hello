package dishizhou;

public class Output implements Runnable{
	private Dxctx st;
	Output(Dxctx st){
		this.st=st;
	}
	public void run(){
		while(true){
			st.get();
		}
	}
}
