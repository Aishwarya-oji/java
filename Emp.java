package serial;
import java.io.*;

class Emp implements Serializable{
	private static final long serialversionUID=129348938L;
	transient int a;
	int b;
	String name;
	int age;
	
	public Emp(String name,int age,int a,int b)
	{
		this.name=name;
		this.age=age;
		this.a=a;
		this.b=b;
	}
}


