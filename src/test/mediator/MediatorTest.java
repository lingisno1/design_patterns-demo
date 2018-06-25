package mediator;

import junit.framework.TestCase;

/**
 * 中介者模式测试类：用一个中介对象来封装一系列对象交互。
 * 中介者使各对象不需要显示地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 */
public class MediatorTest extends TestCase  {

	private ConcreteMediator mediator;
	private ConcreteColleagueA colleagueA;
	private ConcreteColleagueB colleagueB;

	public MediatorTest(String name) {
		super(name);
	}

	public void setUp() {
		mediator = new ConcreteMediator();
		colleagueA = new ConcreteColleagueA(mediator);
		colleagueB = new ConcreteColleagueB(mediator);
		mediator.setColleague1(colleagueA);
		mediator.setColleague2(colleagueB);
	}

	public void tearDown() {
		mediator = null;
		colleagueA = null;
		colleagueB = null;
		System.out.println("junit over!");
	}

	public void testMediator() {
		String msg1 = colleagueA.Send("你吃饭了吗？");
		String msg2 = colleagueB.Send("没有呢？你打算请客吗？");
		assertEquals(msg2, "没有呢？你打算请客吗？");
		assertEquals(msg1, "你吃饭了吗？");
	}
}
