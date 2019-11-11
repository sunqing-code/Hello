package dishizhou;
import java.util.Random;
public class Input implements Runnable{
	private Dxctx st;
	Random r=new Random();
	Input(Dxctx st){
		this.st=st;
	}
	public void run(){
		while(true){
			st.put(r.nextInt(1000));
		}
	}
}
