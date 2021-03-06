package factorymethod;

import factorymethod.MinusFactory;
import factorymethod.Operation;
import factorymethod.PlusFactory;
import junit.framework.TestCase;

/**
 * 工厂方法模式测试类：定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中。核心工厂类不再负责产品的创建，这样核心类成为一个抽象工厂角色，
 * 仅负责具体工厂子类必须实现的接口，这样进一步抽象化的好处是使得工厂方法模式可以使系统在不修改具体工厂角色的情况下引进新的产品。
 */
public class MethodFactoryTest extends TestCase {
	private Operation plusOperation;
	private Operation minusOperation;

	public MethodFactoryTest(String name) {
		super(name);
	}

	public void setUp() {
		plusOperation = new PlusFactory().createOperation();
		plusOperation.setNumberA(2);
		plusOperation.setNumberB(1);
		minusOperation = new MinusFactory().createOperation();
		minusOperation.setNumberA(2);
		minusOperation.setNumberB(1);
	}

	public void tearDown() {
		plusOperation = null;
		minusOperation = null;
		System.out.println("junit over!");
	}

	public void testSimpleFactory() {
		assertEquals(new Double(3), plusOperation.getResult());
		assertEquals(new Double(1), minusOperation.getResult());
	}
}
