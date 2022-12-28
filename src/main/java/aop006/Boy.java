package aop006;

public class Boy implements Person {
	@Override
	public void runSomething() {
		System.out.println("게임을 한다."); //핵심 관심사
	}

}
