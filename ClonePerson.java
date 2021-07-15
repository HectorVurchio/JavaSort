/**
* ClonePerson class to demostrate the use of Cloneable Java interface
* through the usage or Person class.
* @version 1. 
* @author  Hector Jose Vurchio Hurtado
* @since 07/15/2021
*/
public class ClonePerson{
	private static void printResults(Person p){
		String[] s = {"Name: "," Last Name: "," Age: ","Birth Date: "};
		System.out.println(s[0]+p.getName()+", "+
						   s[1]+p.getLastName()+", "+
						   s[2]+p.getAge()+", "+
						   s[3]+p.getBirthDate());
	}
	
	public static void main(String[] args){
		Person p1 = new Person("Hector","Vurchio","1979-08-29");
		Person p2 = new Person("Laura","Addonizio","1981-12-10");
		Person p3 = new Person("Rocco","Vurchio","2018-03-30");
		Person p4 = new Person("Elena","DeTroya","1990-02-27");
		Person p6 = null;
		Person p5 = p4;
		try{
			p6 = (Person)p5.clone();
		}catch(CloneNotSupportedException cne){
			cne.printStackTrace();
		}
		System.out.println("Person 1 in original state");
		ClonePerson.printResults(p1);
		System.out.println("Person 2 in original state");
		ClonePerson.printResults(p2);
		System.out.println("Person 3 in original state");
		ClonePerson.printResults(p3);
		System.out.println("Person 4 in original state");
		ClonePerson.printResults(p4);
		System.out.println("Person 5 copied from person 4");
		ClonePerson.printResults(p5);
		System.out.println("after change just person 5");
		p5.setName("Altered");
		p5.setLastName("No Original");
		p5.setBirthDate("1970-01-01");
		System.out.println("Person 4 after altering person 5");
		ClonePerson.printResults(p4);
		System.out.println("Person 6 cloned from Person 4 before alteration");
		ClonePerson.printResults(p6);
	
	}
}
