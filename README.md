****# ExpertSpring30
김종민 님의 &lt;스프링 입문을 위한 자바 객체지향의 원리와 이해> 중 7장 IoC/DI, AOP 실습 코드입니다.

* 스프링의 3대 프로그래밍 모델
  * IoC/DI
  * AOP
  * PSA

## IoC/DI - 제어의 역전/의존성 주입
### 1-1. 의존성 주입 없이 내부적 객체 생성
[예제) expert001_01](https://github.com/korshorthaircat/ExpertSpring30/tree/main/src/main/java/expert001_01)
* 의사코드 
  > 운전자가 자동차를 생산한다. // new Car();
  > 
  > 자동차는 내부적으로 타이어를 생산한다. // Car 객체의 생성자 안에서 new Tire();

### 1-2. 스프링 없이 의존성 주입하기 - 생성자를 통한 의존성 주입
[예제) expert001_02](https://github.com/korshorthaircat/ExpertSpring30/tree/main/src/main/java/expert001_02)
* 의사코드
  > 운전자가 타이어를 생산한다. // Tire tire = new KoreaTire();
  >
  > 운전자가 자동차를 생산하면서 타이어를 장착한다. // Car car = new Car(tire);

### 1-3. 스프링 없이 의존성 주입하기 - 속성을 통한 의존성 주입
[예제) expert001_03](https://github.com/korshorthaircat/ExpertSpring30/tree/main/src/main/java/expert001_03)
* 의사코드
  > 운전자가 타이어를 생산한다. // Tire tire = new KoreaTire();
  > 
  > 운전자가 자동차를 생산한다. // Car car = new Car();
  >
  > 운전자가 자동차에 타이어를 장착한다. // car.setTire(tire);

### 2. 스프링을 통한 의존성 주입 - XML 파일 사용
[예제) expert002](https://github.com/korshorthaircat/ExpertSpring30/tree/main/src/main/java/expert002)
* 의사코드
  > // ApplicationContext context = new ClassPathXmlApplicationContext("expert002.xml", Driver.class);
  > 
  > 운전자가 종합쇼핑몰에서 타이어를 구매한다. // Tire tire = (Tire)context.getBean("tire");
  > 
  > 운전자가 종합쇼핑몰에서 자동차를 구매한다. // Car car = (Car)context.getBean("car");
  >
  > 운전자가 자동차에 타이어를 장착한다. // car.setTire(tire);

### 3. 스프링을 통한 의존성 주입 - 스프링 설정 파일(XML)에서 속성 주입
[예제) expert003](https://github.com/korshorthaircat/ExpertSpring30/tree/main/src/main/java/expert003)
* 의사코드
  > 운전자가 종합 쇼핑몰에서 자동차를 구매 요청한다.
  > 
  > 종합 쇼핑몰은 자동차를 생산한다.
  > 
  > 종합 쇼핑몰은 타이어를 생산한다.
  > 
  > 종합 쇼핑몰은 자동차에 타이어를 장착한다.
  > 
  > 종합쇼핑몰으 운전자에게 자동차를 전달한다.


### 4. 스프링을 통한 의존성 주입 - @Autowired를 통한 속성 주입
[예제) expert004](https://github.com/korshorthaircat/ExpertSpring30/tree/main/src/main/java/expert004)
* 의사코드
  * 위와 동일

### 5. 스프링을 통한 의존성 주입 - @Autowired vs @Resource vs <property> 태그 
[예제) expert005](https://github.com/korshorthaircat/ExpertSpring30/tree/main/src/main/java/expert005)


## AOP(Aspect-Oriented Programming, 관점 지향 프로그래밍)
>DI가 의존성(new)에 대한 주입이라면, AOP는 로직(code)에 대한 주입이다.
* 핵심관심사와 횡단관심사
  * 핵심관심사: 예) 입금, 출금, 이체
  * 횡단관심사: 예) 로깅, 보안, 트랜잭션
    * 여러 모듈에서 공통적으로, 중복적으로 나타남 -> 분리해서 한 곳에서 관리할 경우 편리
* 메서드에서 코드를 주입할 수 있는 위치
  * 메서드 전 구역 *Around*
  * 메서드 시작 직후 *Before*
  * 메서드 종료 직전 *After*
  * 메서드 정상 종료 직전 *AfterReturning*
  * 메서드에서 예외가 발견되면서 종료된 직전 *AfterThrowing*

### 스프링 AOP
  > 스프링 AOP는 인터페이스 기반이다.
  > 
  > 스프링 AOP는 프록시 기반이다.
  > 
  > 스프링 AOP는 런타임 기반이다. 

### Pointcut 자르는 지점? &rarr; Aspect 적용 위치 지정자!
* Pointcut
  * 스프링 AOP의 경우
    * Pointcut = **횡단관심사를 적용할 타깃 메서드를 선택하는 지시자(메서드 필터)**
    * Pointcut = **타깃 클래스의 타깃 메서드 지정자**
  * 다른 AOP 프레임워크의 경우(예: AspectJ)
    * 메서드 뿐만 아니라 속성 등에서도 Aspect를 적용할 수 있음
    * 따라서 Pointcut = **Aspect 적용 위치 지정자(지시자)**
* 포인트컷 형식
  * ```
    [접근제한자] 리턴타입 [패키지명.클래스명.] 메서드명(파라미터) [throws 예외]
    //대괄호 []는 생략 가능
* 포인트컷 표현식의 예)
  * ```
    public void aop002.Boy.runSomething()
    //접근제한자가 public이고 리턴타입이 void이며 aop002 패키지 이하의 Boy 클래스 안의 runSomething() 메서드를 Pointcut으로 지정하라
    * runSomething()
    //접근제한자는 무엇이든 좋으며(생략됨) 리턴타입도 무엇이든 좋으며(*) 모든 패키지 밑의(생략됨) 모든 클래스 안의(생략됨) 파라미터가 없으며 던져지는 에러가 있든 없든 이름이 runSomething인 메서드들을 Pointcut으로 지정하라

### Joinpoint 연결점? &rarr; 연결 가능한 지점! 
* Joinpoint 
  * 광의의 Joinpoint
    * **Aspect 적용이 가능한 모든 지점"
    * 스프링프레임워크가 관리하는 빈의 모든 메서드 
  * 협의의 Joinpoint
    * 호출된 객체의 메서드
  * Pointcut은 Joinpoint의 부분집합임
    * 왜냐하면 포인트컷의 후보가되는 모든 메서드들이 조인포인트가 되기 때문

### Advice 조언? &rarr; 언제, 무엇을!
* Advice
  * Pointcut에 언제 무엇을 적용할지 정의한 메서드
  * 타긱 객체의 타깃 메서드에 적용될 부가 기능 

### Aspect 관점? 측면? &arr; Advisor의 집합체!
* Aspect
  * Advice들(언제? 무엇을?) + Pointcut들(어디에?)

### Advisor 조언자? &arr; 언제, 무엇을, 어디에!
* Advisor
  * 한 개의 Advice + 한 개의 Pointcut
  * Advisor는 스프링AOP에서만 사용하는 용어
  * 스프링 버전이 올라감에 따라 이지는 사용하지 말라고 권고하는 기능
    * 스프링의 발전과정에 따라 다수의 Advice와 다수의 Pointcut을 다양하게 조합해 사용하는 방법, 즉 Aspect가 나왔으므로 Advisor를 사용할 필요가 없어짐
