package factorysimple;

import factorysimple.Operation;
import factorysimple.OperationFactory;
import junit.framework.TestCase;

/**
 * 简单工厂模式测试类：由一个工厂对象决定创建出哪一种产品类的实例
 */
public class SimpleFactoryTest extends TestCase {
	private Operation plusOperation;
	private Operation minusOperation;

	public SimpleFactoryTest(String name) {
		super(name);
	}

	public void setUp() {
		plusOperation = OperationFactory.createOperation("+");
		plusOperation.setNumberA(2);
		plusOperation.setNumberB(1);
		minusOperation = OperationFactory.createOperation("-");
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
