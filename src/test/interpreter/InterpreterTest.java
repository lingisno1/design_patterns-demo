package interpreter;

import junit.framework.TestCase;

/**
 * 解释器模式测试类：给定一个语言之后，解释器模式可以定义出其文法的一种表示，并同时提供一个解释器。
 * 客户端可以使用这个解释器来解释这个语言中的句子。
 */
public class InterpreterTest extends TestCase  {

	private Context context;
	private Variable x;
	private Variable y;
	private Constant constant;

	public InterpreterTest(String name) {
		super(name);
	}

	public void setUp() {
		x = new Variable("x");
		y = new Variable("y");
		context = new Context();
        context.assign(x, false);
		context.assign(y, false);
        constant = new Constant(true);
	}

	public void tearDown() {
		context = null;
		x = null;
		y = null;
		constant = null;
		System.out.println("junit over!");
	}

	public void testInterpreter() {
		Expression exp = new Not(new Or(new And(constant, x), new And(y, new Not(x))));
        System.out.println("x=" + x.interpret(context));
        System.out.println("y=" + y.interpret(context));
        System.out.println(exp.toString() + "=" + exp.interpret(context));
        assertTrue(exp.interpret(context));
	}
}
