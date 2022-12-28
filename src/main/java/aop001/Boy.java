package aop001;

public class Boy {
	
	public void runSomething() {
		System.out.println("열쇠로 문을 열고 집에 들어간다.");
		
		try {
			System.out.println("게임을 한다."); //핵심 관심사
		} catch (Exception e) {
			if (e.getMessage().equals("집에 불 남!")) {
				System.out.println("119에 신고한다.");
			}
		} finally {
			System.out.println("소등하고 잔다.");
		}
		
		System.out.println("문을 잠그고 집을 나선다.\n");
	}

}
