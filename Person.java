public class Person implements Comparable<Person>{
	private String name;
	private String lastName;
	private byte age;
	private char order;
	
	public Person(String name, String lastName, 
					byte age, char order){
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.order = order;
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
	public char getOrder(){
		return this.order;
	}
	/** 
	*	Method from Comparable interface. Both String and Byte class implement 
	*	Comparable interface as well.
	*	@param Person object.
	*	@returns an int indicating the difference of both values.
	*/
	public int compareTo(Person person){
		switch(order){
			case 'n':
				return this.name.compareTo(person.getName());
			case 'l':
				return this.lastName.compareTo(person.getLastName());
			case 'a':
				return Byte.valueOf(this.age).compareTo(Byte.valueOf(person.getAge()));
		}
		return Integer.MAX_VALUE;
	}
}