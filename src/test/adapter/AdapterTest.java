package adapter;

import junit.framework.TestCase;

/**
 * 适配器模式测试类：把已有的接口适配成客户端所期待的新接口，从而使原本因接口不匹配无法在一起工作的两个类可以在一起工作。
 * 用于后期维护期间为了兼容旧版本
 */
public class AdapterTest extends TestCase {
	private IAdaptee iAdaptee;
	private ITarget iTarget;

	public AdapterTest(String name) {
		super(name);
	}

	public void setUp() {
		iAdaptee = new Adaptee(); 
		iTarget = new Adapter(iAdaptee); 
	}

	public void tearDown() {
		iAdaptee = null;
		iTarget = null;
		System.out.println("junit over!");
	}

	public void testStrategy() {
		iTarget.request();
	}
}
