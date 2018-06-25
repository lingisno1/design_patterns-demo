package chainofresponsibility;

import junit.framework.TestCase;

/**
 * 责任链模式测试类：使多个对象都有机会处理请求，从而避免请求者和接收者之间的耦合关系。将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 */
public class ChainOfResponsibilityTest extends TestCase {
	private Handler successorA;
	private Handler successorB;
	private Handler successorC;

	public ChainOfResponsibilityTest(String name) {
		super(name);
	}

	public void setUp() {
		successorA = new ConcreteHandlerA();
		successorB = new ConcreteHandlerB();
		successorC = new ConcreteHandlerC();
		//定义继任者关系 A → B → C
		successorA.setSuccessor(successorB);
		successorB.setSuccessor(successorC);
	}

	public void tearDown() {
		successorA = null;
		successorB = null;
		successorC = null;
		System.out.println("junit over!");
	}

	public void testStrategy() {
		successorA.handleRequest(Level.Level_A);
		System.out.println("----------");
		successorA.handleRequest(Level.Level_B);
		System.out.println("----------");
		successorA.handleRequest(Level.Level_C);
	}
}
