package command;

import junit.framework.TestCase;

/**
 * 命令模式测试类：将一个请求封装一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤回操作。
 */
public class CommandTest extends TestCase  {

	private LightReceiver  receiver;
	private CommandOn  commandOn;
	private CommandOff  commandOff;
	private Invoker  invoker;

	public CommandTest(String name) {
		super(name);
	}

	public void setUp() {
		receiver = new LightReceiver();
		commandOn = new CommandOn(receiver);
		commandOff = new CommandOff(receiver);
		invoker = new Invoker(commandOn, commandOff);
	}

	public void tearDown() {
		receiver = null;
		commandOn = null;
		commandOff = null;
		invoker = null;
		System.out.println("junit over!");
	}

	public void testFacade() {
		invoker.turnOn();
		invoker.turnOff();
	}
}
