package week2;

public  class Birds {
	int age;
	String name;
	public Birds() {
		System.out.println("these are the birds");
	}
	public Birds(String x) {
		name=x;
		System.out.println("this bird name is "+name);
	}
	public Birds(int x,String y) {
		name=y;
		age=x;
		System.out.println("bird name is "+name+" and age is "+age);
	}

	public static void main(String[] args) {
         Birds s=new Birds();
         //s.Birds();
         Birds s1=new Birds("parrot");
         Birds s2=new Birds(6,"humming bird");
         }

}
