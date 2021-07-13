public class Person{
	private String name;
	private String lastName;
	private byte age;
	
	public Person(String name,String lastName,byte age){
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	public String getLastName(){
		return this.lastName;
	}
	public byte getAge(){
		return this.age;
	}

}