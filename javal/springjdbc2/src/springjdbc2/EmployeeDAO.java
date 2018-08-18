package springjdbc2;

public interface EmployeeDAO {
	
	int insertEmployee(Employee e);
	void listAllEmployees();
	int updateEmployee(int empno,double sal );

}
