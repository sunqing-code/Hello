package factory;
import tv.*;

public class HaierTVFactory implements TVFactory{      //HaierTVFactory��ʵ��TVfactory�ӿ�
	public TV produceTV() {
		return new HaierTV();
	}
}
