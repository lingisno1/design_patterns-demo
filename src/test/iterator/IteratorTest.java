package iterator;

import junit.framework.TestCase;

/**
 * 解释器模式测试类：给定一个语言之后，解释器模式可以定义出其文法的一种表示，并同时提供一个解释器。
 * 客户端可以使用这个解释器来解释这个语言中的句子。
 */
public class IteratorTest extends TestCase  {

	private Aggregate aggregate;

	public IteratorTest(String name) {
		super(name);
	}

	public void setUp() {
		aggregate = new ConcreteAggregate();
	}

	public void tearDown() {
		aggregate = null;
		System.out.println("junit over!");
	}

	public void testInterpreter() {
		aggregate.add("a");
		aggregate.add("b");
		aggregate.add("c");
		aggregate.add("d");
		aggregate.add("e");
		Iterator iterator = aggregate.getIterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
			if ("b".equals(next.toString())) {
				iterator.remove();
			}
		}
		for(int i=0; i<aggregate.getSize(); i++) {
			if (i == aggregate.getSize()-1) {
				System.out.print(aggregate.get(i));
			} else {
				System.out.print(aggregate.get(i) + ",");
			}
		}
		System.out.println();
	}
}
