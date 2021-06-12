package week2;

public class Student {
	String name,city;
	int age;
	static int m;
	 void DataList(){
		System.out.println("my name is "+name);
		System.out.println("my city is "+city);
		System.out.println("my age is just "+age);
		
	}
	static class Test{
		public static void main(String args[]) {
			Student s1=new Student();
			Student s2=new Student();
			s1.name="hasan";
			s1.city="thoothukudi";
			s1.age=18;
			s2.name="abdul muhaimeen";
			s2.city="kayalpatnam";
			s2.age=21;
			s1.DataList();
			s2.DataList();
			s1.m=12;
			s2.m=13;
			Student.m=23;
			
			System.out.println("the s1 output is "+s1.m);
			System.out.println("the s2 output is "+s2.m);
			System.out.println("the student output is "+Student.m);
			
		}
	}
}