package week2;

public class CS {
	int p,q;
	public CS() {
		
	}
	public CS(int x,int y) {
		p=x;
		q=y;
	}
	public int add(int x,int y) {
		return x+y;
	}
	public int add(int x,int y,int z) {
		return x+y+z;
	}
	public float add(float f1,float f2) {
		return f1+f2;
	}


public void Data() {
	System.out.println("p is "+p);
	System.out.println("q is "+q);
}
}
class Test{
	public static void main(String[] args) {
		int x=3,y=5,z=10;float m=2.5f,n=3.6f;
		CS ob1=new CS();
		CS ob2=new CS(x,y);
		ob1.Data();
		int s=ob1.add(x, y);
		int d=ob1.add(x, y, z);
		float fr=ob1.add(m, n);
		System.out.println("adding 2 integer "+s);
		System.out.println("adding 3 integer "+d);
		System.out.println("adding 2 floating "+fr);
		
		
	}
}
