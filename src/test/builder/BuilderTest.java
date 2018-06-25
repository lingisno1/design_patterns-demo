package builder;

import junit.framework.TestCase;

/**
 * 建造者模式测试类：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 */
public class BuilderTest extends TestCase {
	private Director director;
	private ConcreteBuilderA concreteBuilderA;
	private ConcreteBuilderB concreteBuilderB;

	public BuilderTest(String name) {
		super(name);
	}

	public void setUp() {
		director = new Director();
		concreteBuilderA = new ConcreteBuilderA(); 
		concreteBuilderB = new ConcreteBuilderB(); 
	}

	public void tearDown() {
		director = null;
		concreteBuilderA = null;
		concreteBuilderB = null;
		System.out.println("junit over!");
	}

	public void testStrategy() {
		director.construct(concreteBuilderA);
		System.out.println(concreteBuilderA.getProduct().toString());
		System.out.println("--------------------");
		director.construct(concreteBuilderB);
		System.out.println(concreteBuilderB.getProduct().toString());
	}
}
