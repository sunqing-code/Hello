package factory;
import tv.*;

public class HisenseTVFactory implements TVFactory{        //HisenseTVFactory��ʵ��TVfactory�ӿ�
	public TV produceTV() {
		return new HisenseTV();
	}
} 