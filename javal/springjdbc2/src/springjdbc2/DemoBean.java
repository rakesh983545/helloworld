package springjdbc2;

public class DemoBean {
	
	private EmployeeDAO dao;
	public void setDAO(EmployeeDAO dao )
	{
		this.dao=dao;
	}
	
	public void insert(Employee e)
	{
		int x=dao.insertEmployee(e);
		System.out.println(x+"row inserted");
	}
	
	public void selectAll()
	{
		dao.listAllEmployees();
	}
	public void modify(int empno,double sal)
	{
		int x=dao.updateEmployee(empno, sal);
		System.out.println(x+"row updated");
	}

}
