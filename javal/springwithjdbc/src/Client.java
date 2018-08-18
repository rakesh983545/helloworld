import org.springframework.context.*;
import org.springframework.context.support.*;

public class Client {
		public static void main(String[] args) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
			Object o=ctx.getBean("id3");
			DemoBean db=(DemoBean)o;
			
			db.createTable();
			db.insertRow();
		}
}
