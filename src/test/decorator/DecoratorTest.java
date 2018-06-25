package decorator;

import junit.framework.TestCase;

/**
 * 装饰模式测试类：在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。
 * 它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
 */
public class DecoratorTest extends TestCase {
	private ConcreteComponent concreteComponent;
	private ConcreteDecoratorA concreteDecoratorA;
	private ConcreteDecoratorB concreteDecoratorB;

	public DecoratorTest(String name) {
		super(name);
	}

	public void setUp() {
		concreteComponent = new ConcreteComponent();
		concreteDecoratorA = new ConcreteDecoratorA(concreteComponent);
		concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);
	}

	public void tearDown() {
		concreteComponent = null;
		concreteDecoratorA = null;
		concreteDecoratorB = null;
		System.out.println("junit over!");
	}

	public void testStrategy() {
		concreteComponent.operation();
		System.out.println("--------------------");
		concreteDecoratorA.operation();
		System.out.println("--------------------");
		concreteDecoratorB.operation();
	}
}
