package springjdbc2;

import java.util.*;
import org.springframework.jdbc.core.*;
public class EmployeeDAOImp1 implements EmployeeDAO {
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt)
	{
		this.jt=jt;
	}
	
	public int insertEmployee(Employee e)
	{
		int eno=e.getEmpno();
		String ename=e.getEname();
		int sal=e.getSal();
		int dno=e.getDeptno();
		Object params[]= {eno,ename,sal,dno};//object array
		int k=jt.update("insert into employee values(?,?,?,?)",params);
		return k;
	}
	
	public void listAllEmployees()
	{
		List l=jt.queryForList("select * from employee");
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
	}
	
	public int updateEmployee(int empno,double sal)
	{
		Object params[]= {sal,empno};
		int k=jt.update("update employee set sal=? where empno=?",params);
		return k;
	}

}
