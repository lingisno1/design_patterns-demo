package observer;

import junit.framework.TestCase;

/**
 * 观察者模式测试类：定义了一对多的依赖关系，让多个观察者对象同时监听某一个主题对象，当主题对象状态变化时通知所有观察者更新自己。
 */
public class ObserverTest extends TestCase {

	private Suspects suspects;
	private PoliceA policeA;
	private PoliceB policeB;

	public ObserverTest(String name) {
		super(name);
	}

	public void setUp() {
		policeA = new PoliceA();
		policeB = new PoliceB();
		suspects = new SharpSuspects();
		suspects.registerObserver(policeA);
		suspects.registerObserver(policeB);
	}

	public void tearDown() {
		suspects = null;
		policeA = null;
		policeB = null;
		System.out.println("junit over!");
	}

	public void testObserver() {
		suspects.crime();
	}

}
