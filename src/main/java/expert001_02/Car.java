package expert001_02;

public class Car {
	Tire tire;
	
	public Car(Tire tire) {
		//tire = new KoreaTire();
		//tire = new AmericaTire();
		//생성자 안에서 객체를 생성하지 않고, 외부에서 인자를 받는다. (Tire를 생산new하는 부분은 Driver.java에서 맡는다)
		this.tire = tire;
	}
	
	public String getTireBrand() {
		return "장착된 타이어: " + tire.getBrand();
	}

}
