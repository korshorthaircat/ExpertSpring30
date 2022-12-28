package aop002;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

@Aspect //해당 클래스를 AOP에서 사용하겠다는 의미
public class MyAspect { //횡단관심사를 분리하여 작성한다. 
	//AOP를 적용하면 단일책임원칙(SRP)를 자연스럽게 적용하게 된다.

	//@Before("execution(public void aop002.Boy.runSomething())") //대상메서드 실행 전 이 메서드를 실행하겠다는 의미
	@Before("execution(* runSomething())")
	public void before(JoinPoint joinPoint //JoinPoint는 @Before에서 선언된 메서드를 의미
			) {
		System.out.println("얼굴 인식 확인, 문을 개방하라.");
	}
}
