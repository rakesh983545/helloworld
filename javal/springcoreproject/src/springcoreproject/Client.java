package springcoreproject;

import org.springframework.core.io.*; 
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
public class Client {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("spconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Object o=factory.getBean("id1");
		
		SampleBean sb=(SampleBean)o;
		sb.show();
		
		/*WelcomeBean wb=(WelcomeBean)o;
		wb.show();*/
		
		Object o1=factory.getBean("id2");
		ExampleBean eb=(ExampleBean)o1;
		eb.show1();
		
		Object o2=factory.getBean("id3");
		DemoBean db=(DemoBean)o2;
		System.out.println(db);
	}

}
