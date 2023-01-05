package in.co.Java8;

public class LambdaExpression {
	public static void main(String[] args) {

		// Anonymous object using conventional approach

		HelloInt aFun = new HelloInt() {
			public void say() {
				System.out.println("Hello Anonymous conventional function");
			}
		};
		aFun.say();
		// Anonymous object using lambda function

		HelloInt lambFun = () -> System.out.println("Hello Anonymous lambda function");

		lambFun.say();
		// Add lambda implementation of math functional interface

		MathInt add = (a, b) -> {
			return a+b;
		};
		// Multiply lambda implementation of math functional interface

		MathInt multiply = (a, b) -> {
			return a * b;
		};
		// subtract lambda implementation of math functional interface

		MathInt subtract = (a, b) -> {
			return a - b;
		};

		int a = 10;
		int b = 5;

		System.out.println("Add :" + add.calculate(a, b));
		System.out.println("Multiply :" + multiply.calculate(a, b));
		System.out.println("Subtract :" + subtract.calculate(a, b));

		// Method reference in lambda function

		GreetingInt g = System.out::println;
		g.hello("Ram");
		g.hello("Hari");

	}

}
