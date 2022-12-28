package aop004;

import org.aspectj.lang.JoinPoint;

//POJO & XML 기반 AOP 작성시 -> 스프링프레임워크에 종속되지 않음
public class MyAspect { //횡단관심사를 분리하여 작성한다. 

	public void before(JoinPoint joinPoint) {
		System.out.println("얼굴 인식 확인, 문을 개방하라.");
	}
	
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("주인님 나갔다: 어이 문 잠가!");
	}
}
