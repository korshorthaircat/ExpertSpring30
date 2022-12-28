package aop006;

public class Girl implements Person {
	@Override
	public void runSomething() {
		System.out.println("요리를 한다."); //핵심 관심사
	}
	
}
