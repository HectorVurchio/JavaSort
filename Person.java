import java.util.Date;
import java.util.GregorianCalendar;
/** 
* This class is the blueprint for the Person object used to 
* demonstrate how the Cloneable interface works.
* Using Date instead of LocalDate due its mutablility, useful for
* this example.
* @version 1. 07/15/2021
* @author  Hector Jose Vurchio Hurtado
*/
public class Person implements Cloneable{
	private String name;
	private String lastName;
	private byte age;
	private Date birthDate; 
	
	public Person(String name, String lastName,String birthDate){
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		setBirthDate(birthDate);
	}
	/** 
	* Method inherited from Object class. Is being used the override 
	* just for programmers location purposes.
	* @throws CloneNotSupportedException, from Object clone() method
	* compliance.
	* @return a cloned Person Object
	*/
	@Override
	public Person clone() throws CloneNotSupportedException{
		//clone the fields as well for a deep cloning p 318
		//clone mutable fields p321
		return (Person)super.clone();
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public byte getAge(){
		return this.age;
	}
	public Date getBirthDate(){
		return this.birthDate;
	}
	
	/**
	* Setter method to brings the value of birthDate field.
	* @param birth, the String birth date in format "Y-M-D"
	*/
	public void setBirthDate(String birth){
		String[] bd = birth.split("-");
		int year = Integer.valueOf(bd[0]);
		int month = Integer.valueOf(bd[1]);
		int day = Integer.valueOf(bd[2]);
		this.birthDate = new GregorianCalendar(year,month,day).getTime();
	}

}