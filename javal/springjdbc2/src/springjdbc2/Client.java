package springjdbc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		Object o=ctx.getBean("id4");
		DemoBean db=(DemoBean)o;
		Employee e=new Employee();
		e.setEmpno(1616);
		e.setEname("durga");
		e.setSal(8000);
		e.setDeptno(20);
		db.insert(e);
		System.out.println("==========");
		db.selectAll();
		
		System.out.println("==========");
		db.modify(1515,9000);
		
		System.out.println("==========");
	}

}
