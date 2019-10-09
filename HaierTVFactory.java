package factory;
import tv.*;

public class HaierTVFactory implements TVFactory{      //HaierTVFactory类实现TVfactory接口
	public TV produceTV() {
		return new HaierTV();
	}
}
