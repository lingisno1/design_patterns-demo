package proxy;

import junit.framework.TestCase;

/**
 * 装饰模式测试类：为其他对象提供一种代理以控制对这个对象的访问。
 */
public class ProxyTest extends TestCase {
	private Proxy proxy;
	private RealSubject realSubject;

	public ProxyTest(String name) {
		super(name);
	}

	public void setUp() {
		realSubject = new RealSubject();
		proxy = new Proxy(realSubject);
	}

	public void tearDown() {
		proxy = null;
		realSubject = null;
		System.out.println("junit over!");
	}

	public void testStrategy() {
		proxy.request();
	}
}
