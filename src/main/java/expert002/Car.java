package expert002;

public class Car {
	Tire tire;
	
	public Tire getTire() { //tire 속성에 대한 접근자
		return tire;
	}
	
	public void setTire(Tire tire) { //tire 속성에 대한 설정자
		this.tire = tire;
	}
	
	public String getTireBrand() {
		return "장착된 타이어: " + tire.getBrand();
	}

}
