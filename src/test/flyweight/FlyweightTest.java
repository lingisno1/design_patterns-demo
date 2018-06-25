package flyweight;

import junit.framework.TestCase;

/**
 * 享元模式测试类：采用一个共享来避免大量拥有相同内容对象的开销。最常见、直观的就是内存损耗。享元模式以共享的方式高效的支持大量的细粒度对象。
 * (目的，使对象共享，减少内存损耗，享元对象能做到共享的关键是区分内蕴状态-Internal State和外蕴状态-External State)
 */
public class FlyweightTest extends TestCase {
	private FlyweightFactory factory;

	public FlyweightTest(String name) {
		super(name);
	}

	public void setUp() {
		factory = new FlyweightFactory();
	}

	public void tearDown() {
		factory = null;
		System.out.println("junit over!");
	}

	public void testFlyweight() {
		assertEquals(factory.factory("a"), factory.factory("a"));
		System.out.println("是否可以共享对象：" + (factory.factory("a") == factory.factory("a")));
	}
}
