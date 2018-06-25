package memento;

import junit.framework.TestCase;

/**
 * 适配器模式测试类：把已有的接口适配成客户端所期待的新接口，从而使原本因接口不匹配无法在一起工作的两个类可以在一起工作。
 * 用于后期维护期间为了兼容旧版本
 */
public class MementoTest extends TestCase {
	private CareTaker careTaker;
	private Originator originator;

	public MementoTest(String name) {
		super(name);
	}

	public void setUp() {
		careTaker = new CareTaker(); 
		originator = new Originator("管理", 20); 
	}

	public void tearDown() {
		careTaker = null;
		originator = null;
		System.out.println("junit over!");
	}

	public void testStrategy() {
		careTaker.setMemento(originator.backUp());//备份后交给管理人保管
		System.out.println("20年前：" + originator.toString());
		//20年后
		originator.setAge(40);
		System.out.println("20年后：" + originator.toString());
		//时光倒流20年
		originator.recovery(careTaker.getMemento());//从管理人获取之前备份的备忘录后恢复数据
		System.out.println("穿越20年前：" + originator.toString());
		assertEquals(20, originator.getAge());
	}

}
