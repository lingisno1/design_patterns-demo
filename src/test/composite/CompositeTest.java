package composite;

import junit.framework.TestCase;

/**
 * 组合模式测试类：组合多个对象形成树形结构以表示"整体-部分"的结构层次。对单个对象或者组合对象具有一致性。
 * 使用场景：需求体现部分与整体层次结构，以及希望用户可以忽略组合与单个对象的不同，统一地使用组合结构中的所有对象时，可以考虑使用该模式。
 */
public class CompositeTest extends TestCase {

	public CompositeTest(String name) {
		super(name);
	}

	public void setUp() {
	}

	public void tearDown() {
		System.out.println("junit over!");
	}

	public void testStrategy() {
		Composite computer = new Composite("计算机");
		computer.add(new Leaf("DVD 驱动器"));
		Composite cPan = new Composite("C盘");
		cPan.add(new Leaf("C盘中的文件"));
		Composite dPan = new Composite("D盘");
		Composite dPanFolder = new Composite("D盘文件夹");
		Leaf dPanFile = new Leaf("D盘文件");
		dPanFolder.add(dPanFile);
		dPan.add(dPanFolder);
		computer.add(cPan);
		computer.add(dPan);
		computer.display(1);
		System.out.println("----------after delete D Pan File----------");
		dPanFolder.delete(dPanFile);
		computer.display(1);
	}
}
