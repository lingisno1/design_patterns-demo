package flyweight.composite;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

/**
 * 复合享元模式测试类：复合享元角色所代表的对象是不可以共享的，但是一个复合享元对象可以分解成为多个本身是单纯享元对象的组合。
 * 复合享元角色又称作不可共享的享元对象(实现抽象抽象享元角色，定义Map<内蕴状态,享元对象>来维护复合享元角色对象，并且提供公开的添加复合享元对象到Map的方法)
 */
public class CompositeFlyweightTest extends TestCase {
	private CompositeFlyweightFactory compositeFlyweightFactory;

	public CompositeFlyweightTest(String name) {
		super(name);
	}

	public void setUp() {
		compositeFlyweightFactory = new CompositeFlyweightFactory();
	}

	public void tearDown() {
		compositeFlyweightFactory = null;
		System.out.println("junit over!");
	}

	public void testCompositeFlyweightTest() {
		//享元模式
		String externalState = "a";
		Flyweight flyweight1 = compositeFlyweightFactory.factory(externalState);
		Flyweight flyweight2 = compositeFlyweightFactory.factory(externalState);
		assertTrue(flyweight1 == flyweight2);
		System.out.println("享元模式是否可以共享对象：" + (flyweight1 == flyweight2));
		//复合享元模式
		List<String> externalStateList = Arrays.asList("a", "b", "a");
		Flyweight compositeFlyweight1 = compositeFlyweightFactory.factory(externalStateList);
		Flyweight compositeFlyweight2 = compositeFlyweightFactory.factory(externalStateList);
		assertFalse(compositeFlyweight1 == compositeFlyweight2);
		System.out.println("复合享元模式是否可以共享对象：" + (compositeFlyweight1 == compositeFlyweight2));
	}
}
