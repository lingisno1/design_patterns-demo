package templatemethod;

import templatemethod.GameTemplate;
import templatemethod.ProjectTemplate;
import templatemethod.SoftwareTemplate;
import junit.framework.TestCase;

/**
 * 模板方法测试类：定义一个操作中算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 */
public class TemplateMethodTest extends TestCase {

	private ProjectTemplate template;

	public TemplateMethodTest(String name) {
		super(name);
	}

	public void setUp() {
	}

	public void tearDown() {
		template = null;
		System.out.println("junit over!");
	}

	public void testTemplateMethod() {
		template = new GameTemplate();
		template.process();
		System.out.println("--------------------");
		template = new SoftwareTemplate();
		template.process();
	}
}
