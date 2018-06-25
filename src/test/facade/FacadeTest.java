package facade;

import junit.framework.TestCase;

/**
 * 外观模式测试类：把一些复杂的流程封装成一个接口(门面角色)给外部用户更简单的使用
 */
public class FacadeTest extends TestCase  {

	private Facade facade;

	public FacadeTest(String name) {
		super(name);
	}

	public void setUp() {
		facade = new Facade();
	}

	public void tearDown() {
		facade = null;
		System.out.println("junit over!");
	}

	public void testFacade() {
		System.out.println("-----门面组合方法A-----");
		facade.methodA();
		System.out.println("-----门面组合方法B-----");
		facade.methodB();
	}
}
