package week2;

public class EmployeeDetails {
	int empId;
	String name;
	char bloodGroup;
	EmployeeDetails(int id,String names,char blood){
		this.empId=id;
		this.name=names;
		this.bloodGroup=blood;
	}
	void info() {
		System.out.println("empid :"+empId+" name :"+name+" bloodGroup:"+bloodGroup);
		
	}
	public static void main(String[] args) {
		EmployeeDetails ob1=new EmployeeDetails(12,"hasan abdul muhaimeen",'o');
		EmployeeDetails ob2=new EmployeeDetails(18,"mathavan",'A');
		EmployeeDetails ob3=new EmployeeDetails(38,"sasi kumar",'B');
		ob1.info();
		ob2.info();
		ob3.info();
	}

}
