import org.springframework.jdbc.core.*;
public class DemoBean {
	
	private JdbcTemplate jt;
	DemoBean(JdbcTemplate jt)
	{
		this.jt=jt;
	}
	
	public void createTable()
	{
		jt.execute("create table employee(empid number(4),ename varchar2(10),esal number(7,2)");
		System.out.println("table is created suuccessfully");
		
	}
	
	public void insertRow()
	{
		int k=jt.update("insert into employee values(1001,'durga',2000)");
	
				System.out.println("record is inserted successfully"+k);
	}

}
