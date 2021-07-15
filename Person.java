import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.Instant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
	private int age;
	private Date birthDate; 
	
	public Person(String name, String lastName,String birthDate){
		this.name = name;
		this.lastName = lastName;
		setBirthDate(birthDate);
		setAge(this.birthDate);
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
	public int getAge(){
		return this.age;
	}
	public String getBirthDate(){
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return formatter.format(this.birthDate);
	}
	
	/**
	* Setter method to brings the value of birthDate field.
	* This is an old style way to get an object to represnt
	* a date. Used in versions before to Java 8. Needed now
	* because is necessary a mutable object.
	* @param birth, the String birth date in format "Y-M-D"
	*/
	public void setBirthDate(String birth){
		String[] bd = birth.split("-");
		int year = Integer.valueOf(bd[0]);
		int month = Integer.valueOf(bd[1])-1;
		int day = Integer.valueOf(bd[2]);
		this.birthDate = new GregorianCalendar(year,month,day).getTime();
	}
	/**
	* And old style method to calculate an age. It has been used from
	* Java 7 to back versions. Used by this example due to it mutability.
	* @param bd as birth date instantiated in a Date object.
	*/
	private void setAge(Date bd){
		DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Date now = Date.from(Instant.now());
		int dateBirth = Integer.parseInt(formatter.format(bd));                            
		int dateNow = Integer.parseInt(formatter.format(now));                          
		this.age = (dateNow - dateBirth) / 10000;                                                       
	}
}