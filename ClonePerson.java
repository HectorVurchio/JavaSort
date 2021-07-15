/**
* ClonePerson class to demostrate the use of Cloneable Java interface
* through the usage or Person class.
* @version 1. 07/15/2021
* @author  Hector Jose Vurchio Hurtado
*/
public class ClonePerson{
	
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
		System.out.println("Person 4 in original state");
		System.out.println(p4.getName()+" "+p4.getLastName()+" "+
							p4.getAge()+" "+p4.getBirthDate()+" ");
		System.out.println("Person 5 copied from person 4");
		System.out.println(p5.getName()+" "+p5.getLastName()+" "+
							p5.getAge()+" "+p5.getBirthDate()+" ");
		System.out.println("after change just person 5");
		p5.setName("Altered");
		p5.setLastName("No Original");
		p5.setBirthDate("1970-02-27");
		System.out.println("Person 4 after alter person 5");
		System.out.println(p4.getName()+" "+p4.getLastName()+" "+
									p4.getAge()+" "+p4.getBirthDate());
		System.out.println("Person 6 cloned from Person 4 before alteration");
		System.out.println(p6.getName()+" "+p6.getLastName()+" "+
									p6.getAge()+" "+p6.getBirthDate());
		
		
	}
}
