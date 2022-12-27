package expert003;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//테스트코드에 스프링 테스트 컨텍스트 프레임워크 접목
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("expert003.xml")
public class CarTest {

	@Autowired
	Car car;
	
	@Test
	public void 자동차_코리아타이어_장착_타이어브랜드_테스트() {
		assertEquals("장착된 타이어: 코리아 타이어", car.getTireBrand());
	}
	
	
	
	//JUnit 테스트 결과(콘솔)
//	INFO : org.springframework.test.context.TestContextManager - @TestExecutionListeners is not present for class [class expert003.CarTest]: using defaults.
//	INFO : org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loading XML bean definitions from class path resource [expert003/expert003.xml]
//	INFO : org.springframework.context.support.GenericApplicationContext - Refreshing org.springframework.context.support.GenericApplicationContext@2cd2a21f: startup date [Tue Dec 27 23:29:55 KST 2022]; root of context hierarchy
//	INFO : org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor - JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
//	INFO : org.springframework.beans.factory.support.DefaultListableBeanFactory - Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@222a59e6: defining beans [koreaTire,americatTire,car,org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.ConfigurationClassPostProcessor$ImportAwareBeanPostProcessor#0]; root of factory hierarchy
//	INFO : org.springframework.context.support.GenericApplicationContext - Closing org.springframework.context.support.GenericApplicationContext@2cd2a21f: startup date [Tue Dec 27 23:29:55 KST 2022]; root of context hierarchy
//	INFO : org.springframework.beans.factory.support.DefaultListableBeanFactory - Destroying singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@222a59e6: defining beans [koreaTire,americatTire,car,org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.ConfigurationClassPostProcessor$ImportAwareBeanPostProcessor#0]; root of factory hierarchy


}
