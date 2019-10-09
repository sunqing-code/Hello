package factory;
import tv.*;

public class HisenseTVFactory implements TVFactory{        //HisenseTVFactory类实现TVfactory接口
	public TV produceTV() {
		return new HisenseTV();
	}
} 