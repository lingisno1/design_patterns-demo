package bridge;

import junit.framework.TestCase;

/**
 * 桥接模式测试类：将抽象部分与实现部分分离，使它们都可以独立地变化。
 * 当实现有多角度分类(实现方也有抽象概念)，每一种分类都有可能变化时，将实现分离，抽象方合成/聚合关系关联实现方。
 */
public class BridgeTest extends TestCase  {

	private Abstraction  abstraction;
	private ConcreteImplementorA  implementorA;
	private ConcreteImplementorB  implementorB;

	public BridgeTest(String name) {
		super(name);
	}

	public void setUp() {
		implementorA = new ConcreteImplementorA();
		implementorB = new ConcreteImplementorB();
	}

	public void tearDown() {
		implementorA = null;
		implementorB = null;
		System.out.println("junit over!");
	}

	public void testFacade() {
		abstraction = new RefinedAbstraction(implementorA);
		abstraction.operation();
		abstraction = new RefinedAbstraction(implementorB);
		abstraction.operation();
		abstraction.refinedOperation();
	}
}
