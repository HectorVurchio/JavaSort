import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;
public class ComparePerson{
	public static void main(String[] args){
		Person p1 = new Person("Hector","Vurchio",(byte)41,'a');
		Person p2 = new Person("Laura","Addonizio",(byte)38,'a');
		Person p3 = new Person("Rocco","Vurchio",(byte)3,'a');
		System.out.println("-----------Compararison by Age------------------------------------");
		System.out.println("Laura y Rocco da -> "+p2.compareTo(p3));
		System.out.println("Rocco y Laura da -> "+p3.compareTo(p2));
		System.out.println("Hector y Laura da -> "+p1.compareTo(p2));
		System.out.println("Laura y Hector da -> "+p2.compareTo(p1));
		/*
			construct a an ArrayList where we can collect all the objects
			that we have created. the list will be printed by using Iterator 
			interface.
		*/
		System.out.println("-----------Object Person in a List no sorted-----------------------");
		List<Person> perlist = new ArrayList<Person>();
		perlist.add(p1);
		perlist.add(p2);
		perlist.add(p3);
		//print using Iterator Interface
		System.out.println("-----------Print Using Iterator Interface--------------------------");
		System.out.println("-----------------------By Age--------------------------------------");
		Iterator<Person> iter = perlist.iterator();
		Person persObj;
		while(iter.hasNext()){
			persObj = iter.next();
			System.out.println(persObj.getName()+" "+persObj.getLastName()+" "+persObj.getAge());
		}
		//print direct out of an ArrayList method or Iterable Interface
		System.out.println("-----------Print Direct Out Of An ArrayList Method------------------");
		perlist.forEach(o->System.out.println(o.getName()+" "+o.getLastName()+" "+o.getAge()));
		//using Stream Interface from Collection Interface
		System.out.println("-----------Using Stream Interface-----------------------------------");
		Stream<Person> strper = perlist.stream();
		System.out.println("Amount of Objects in List "+strper.count());
		strper.close();
		strper = perlist.stream();
		System.out.println("-----------Print the List Sorted by Age-----------------------------");
		strper.sorted().forEach(x->System.out.println(x.getName()+" "+x.getLastName()+" "+x.getAge()));
		//print again from original List
		System.out.println("-----------Print Again from original List---------------------------");
		perlist.forEach(l->System.out.println(l.getName()+" "+l.getLastName()+" "+l.getAge()));
		
		
		
		
		
		
		System.out.println("********************************************************************");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("####################################################################");
		p1 = new Person("Hector","Vurchio",(byte)41,'n');
		p2 = new Person("Laura","Addonizio",(byte)38,'n');
		p3 = new Person("Rocco","Vurchio",(byte)3,'n');
		System.out.println("-----------Comparison By Name---------------------------------------");
		System.out.println("Laura y Rocco da -> "+p2.compareTo(p3));
		System.out.println("Rocco y Laura da -> "+p3.compareTo(p2));
		System.out.println("Hector y Rocco da -> "+p1.compareTo(p2));
		System.out.println("Laura y Hector da -> "+p2.compareTo(p1));
		System.out.println("Hector y Rocco da -> "+p1.compareTo(p3));
		//print using Iterator Interface
		System.out.println("-----------Print Using Iterator Interface--------------------------");
		System.out.println("---------------------By Name---------------------------------------");
		List<Person> perlistName = new ArrayList<Person>();
		perlistName.add(p1);
		perlistName.add(p2);
		perlistName.add(p3);
		//print using Iterator Interface
		System.out.println("-----------Print Using Iterator Interface--------------------------");
		Iterator<Person> iterName = perlistName.iterator();
		Person persObjN;
		while(iterName.hasNext()){
			persObjN = iterName.next();
			System.out.println(persObjN.getName()+" "+persObjN.getLastName()+" "+persObjN.getAge());
		}
		//using Stream Interface from Collection Interface
		System.out.println("-----------Using Stream Interface-----------------------------------");
		System.out.println("--------------------By Name-----------------------------------------");
		Stream<Person> strperN = perlistName.stream();
		System.out.println("-----------Print the List Sorted by Name-----------------------------");
		strperN.sorted().forEach(x->System.out.println(x.getName()+" "+x.getLastName()+" "+x.getAge()));
		
		
		
		
		
		
		System.out.println("********************************************************************");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("####################################################################");
		p1 = new Person("Hector","Vurchio",(byte)41,'l');
		p2 = new Person("Laura","Addonizio",(byte)38,'l');
		p3 = new Person("Rocco","Vurchio",(byte)3,'l');
		System.out.println("Comparison by LastName");
		System.out.println("-----------Comparison By Last Name----------------------------------");
		System.out.println("Laura y Rocco da -> "+p2.compareTo(p3));
		System.out.println("Rocco y Laura da -> "+p3.compareTo(p2));
		System.out.println("Hector y Rocco da -> "+p1.compareTo(p2));
		System.out.println("Laura y Hector da -> "+p2.compareTo(p1));
		System.out.println("Hector y Rocco da -> "+p1.compareTo(p3));
		//print using Iterator Interface
		System.out.println("-----------Print Using Iterator Interface--------------------------");
		System.out.println("---------------------By Last Name---------------------------------------");
		List<Person> perlistLastName = new ArrayList<Person>();
		perlistLastName.add(p1);
		perlistLastName.add(p2);
		perlistLastName.add(p3);
		//print using Iterator Interface
		System.out.println("-----------Print Using Iterator Interface--------------------------");
		Iterator<Person> iterLastName = perlistLastName.iterator();
		Person persObjLN;
		while(iterLastName.hasNext()){
			persObjLN = iterLastName.next();
			System.out.println(persObjLN.getName()+" "+persObjLN.getLastName()+" "+persObjLN.getAge());
		}
		//using Stream Interface from Collection Interface
		System.out.println("-----------Using Stream Interface-----------------------------------");
		System.out.println("--------------------By Last Name------------------------------------");
		Stream<Person> strperLN = perlistLastName.stream();
		System.out.println("-----------Print the List Sorted by Last Name------------------------");
		strperLN.sorted().forEach(x->System.out.println(x.getName()+" "+x.getLastName()+" "+x.getAge()));

		
	}
}