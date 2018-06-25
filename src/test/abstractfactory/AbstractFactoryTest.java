package abstractfactory;

import junit.framework.TestCase;

/**
 * 抽象工厂模式测试类：当有多个抽象角色时，使用的一种工厂模式。抽象工厂模式可以向客户端提供一个接口，
 * 使客户端在不必指定产品的具体的情况下，创建多个产品族中的产品对象
 */
public class AbstractFactoryTest extends TestCase {
	private MarketFactoryA marketFactoryA;
	private MarketFactoryB marketFactoryB;

	public AbstractFactoryTest(String name) {
		super(name);
	}

	public void setUp() {
		marketFactoryA = new MarketFactoryA();
		marketFactoryB = new MarketFactoryB();
	}

	public void tearDown() {
		marketFactoryA = null;
		marketFactoryB = null;
		System.out.println("junit over!");
	}

	public void testStrategy() {
		Fruit apple = marketFactoryA.buyFruit();
		apple.juicing();
		Meat pork = marketFactoryA.buyMeat();
		pork.cook();
		System.out.println("--------------------");
		Fruit orange = marketFactoryB.buyFruit();
		orange.juicing();
		Meat beef = marketFactoryB.buyMeat();
		beef.cook();
	}
}
