package dishizhou;
import dishizhou.*;
public class Main {
	public static void main(String[] args){
		Dxctx st=new Dxctx();
		Input input=new Input(st);
		Output output=new Output(st);
		new Thread(input).start();
		new Thread(output).start();
		
	}

}
