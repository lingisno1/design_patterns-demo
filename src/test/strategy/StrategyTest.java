package strategy;

import junit.framework.TestCase;
import strategy.ConcreteStrategyA;
import strategy.ConcreteStrategyB;
import strategy.ConcreteStrategyC;
import strategy.Context;

/**
 * 策略模式测试类：定义了一系列算法,并将每个算法封装起来,使他们可以相互替换,且算法的变化不会影响到使用算法的客户。
 */
public class StrategyTest extends TestCase {
	private Context context;
	private double price;

	public StrategyTest(String name) {
		super(name);
	}

	public void setUp() {
		price = 100.0;
	}

	public void tearDown() {
		context = null;
		System.out.println("junit over!");
	}

	public void testStrategy() {
		context = new Context(new ConcreteStrategyA());
		assertEquals(price, context.getResult(price));
		context = new Context(new ConcreteStrategyB());
		assertEquals(price * 0.9, context.getResult(price));
		context = new Context(new ConcreteStrategyC());
		assertEquals(price * 0.8, context.getResult(price));
	}
}
