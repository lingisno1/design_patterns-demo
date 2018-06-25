package visitor;

import junit.framework.TestCase;

/**
 * 访问者模式测试类：表示一个作用于某对象结构中的各元素的操作。它使你可以再不改变各元素的类的前提下定义作用于这些元素的新操作。
 */
public class VisitorTest extends TestCase {
	private VisitorA visitorA;
	private VisitorB visitorB;
	private ElementA elementA;
	private ElementB elementB;
	private ObjectStruture objectStruture;

	public VisitorTest(String name) {
		super(name);
	}

	public void setUp() {
		visitorA = new VisitorA();
		visitorB = new VisitorB();
		elementA = new ElementA();
		elementB = new ElementB();
		objectStruture = new ObjectStruture();
		objectStruture.addElement(elementA);
		objectStruture.addElement(elementB);
	}

	public void tearDown() {
		visitorA = null;
		visitorB = null;
		elementA = null;
		elementB = null;
		objectStruture = null;
		System.out.println("junit over!");
	}

	public void testStrategy() {
		objectStruture.accept(visitorA);
		objectStruture.accept(visitorB);
	}
}
