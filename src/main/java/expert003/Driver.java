package expert003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("expert003/expert003.xml");
		
		Car car = context.getBean("car", Car.class);
//		Tire tire = context.getBean("tire", Tire.class);
//		
//		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
		
		//실행결과(콘솔)
//		INFO : org.springframework.context.support.ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@64d7f7e0: startup date [Tue Dec 27 23:07:36 KST 2022]; root of context hierarchy
//		INFO : org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loading XML bean definitions from class path resource [expert003/expert003.xml]
//		INFO : org.springframework.beans.factory.support.DefaultListableBeanFactory - Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@21b2e768: defining beans [koreaTire,americatTire,car]; root of factory hierarchy
//		장착된 타이어: 코리아 타이어

	}

}
