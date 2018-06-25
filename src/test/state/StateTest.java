package state;

import junit.framework.TestCase;

/**
 * 状态模式测试类：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 * 总结：每一状态对应一行为，状态顺序影响行为顺序，每一状态结束会指定下一个状态。
 */
public class StateTest extends TestCase {
	private Context context;
	private ConcreteStateA stateA;

	public StateTest(String name) {
		super(name);
	}

	public void setUp() {
		stateA = new ConcreteStateA();
		context = new Context(stateA);
	}

	public void tearDown() {
		context = null;
		stateA = null;
		System.out.println("junit over!");
	}

	public void testStrategy() {
		context.request();
		context.request();
	}
}
