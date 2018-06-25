package singleton;

import junit.framework.TestCase;

/**
 * 单例模式测试类：保证一个类仅有一个实例，并提供全局获取方法。
 */
public class SingletonTest extends TestCase {
	private Singleton singletonA;
	private Singleton singletonB;

	public SingletonTest(String name) {
		super(name);
	}

	public void setUp() {
		singletonA = Singleton.getInstance();
		singletonB = Singleton.getInstance();
	}

	public void tearDown() {
		singletonA = null;
		singletonB = null;
		System.out.println("junit over!");
	}

	public void testStrategy() {
		assertEquals(singletonA, singletonB);
	}
}
