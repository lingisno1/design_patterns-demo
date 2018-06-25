package prototype;

import junit.framework.TestCase;

/**
 * 装饰模式测试类：动态地给对象添加额外的职责，就增加功能来说装饰模式比生成子类更灵活。
 * (在原有功能基础上不变动原始类扩展来调用原始方法后添加自己独有的功能)
 */
public class PrototypeTest extends TestCase {

	public PrototypeTest(String name) {
		super(name);
	}

	public void setUp() {
	}

	public void tearDown() {
		System.out.println("junit over!");
	}

	public void testStrategy() {
		ResumePrototype resumeA = new ResumePrototype("小李");
		resumeA.setPersonalInfo("女", 25);
		resumeA.setWorkExperience("2010-2014", "百度");
		ResumePrototype resumeB = (ResumePrototype) resumeA.clone();
		//assertEquals(resumeA, resumeB);
		resumeB.print();
		System.out.println("--------------------");
		ResumePrototype resumeC = new ResumePrototype("小赵");
		resumeC.setPersonalInfo("男", 30);
		resumeC.setWorkExperience("2010-2018", "阿里");
		ResumePrototype resumeD = (ResumePrototype) resumeC.clone();
		resumeD.print();
	}
}
