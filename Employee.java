package anvitha;
public class Employee {
	int id=38;
	String name;
	void getValue(int i, String n)
	{
		id=i;
		name=n;
	}
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int id=33;
		String name="A";
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.getValue(12, "B");
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e2.id);
		System.out.println(e2.name);
	}

}
