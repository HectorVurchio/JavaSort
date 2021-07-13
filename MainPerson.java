import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
class MainPerson{
	public static void main(String[] args){
		Person p1 = new Person("Hector","Vurchio",(byte)41);
		Person p2 = new Person("Laura","Addonizio",(byte)38);
		Person p3 = new Person("Rocco","Vurchio",(byte)3);
		ArrayList<Person> perlist = new ArrayList<Person>();
		perlist.add(p1);
		perlist.add(p2);
		perlist.add(p3);
		System.out.println("-----------Print Unsorted----------------------------------------");
		Iterator<Person> iter = perlist.iterator();
		Person persObj;
		while(iter.hasNext()){
			persObj = iter.next();
			System.out.println(persObj.getName()+" "+persObj.getLastName()+" "+persObj.getAge());
		}
		System.out.println("-----------Print Sorted By Age------------------------------------");
		Collections.sort(perlist,new SortByAge());
		Iterator<Person>iter2 = perlist.iterator();
		Person persObj2;
		while(iter2.hasNext()){
			persObj2 = iter2.next();
			System.out.println(persObj2.getName()+" "+persObj2.getLastName()+" "+persObj2.getAge());
		}
		System.out.println("-----------Print Sorted By Name------------------------------------");
		Collections.sort(perlist,new SortByName());
		iter2 = perlist.iterator();
		while(iter2.hasNext()){
			persObj2 = iter2.next();
			System.out.println(persObj2.getName()+" "+persObj2.getLastName()+" "+persObj2.getAge());
		}
		System.out.println("-----------Print Sorted By LastName---------------------------------");
		Collections.sort(perlist,new SortByLastName());
		iter2 = perlist.iterator();
		while(iter2.hasNext()){
			persObj2 = iter2.next();
			System.out.println(persObj2.getName()+" "+persObj2.getLastName()+" "+persObj2.getAge());
		}
		System.out.println("-----------Print Sorted By Name and LastName------------------------");
		Collections.sort(perlist,new SortByNameLastN());
		iter2 = perlist.iterator();
		while(iter2.hasNext()){
			persObj2 = iter2.next();
			System.out.println(persObj2.getName()+" "+persObj2.getLastName()+" "+persObj2.getAge());
		}
		System.out.println("-----------Print Sorted By LastName and Age------------------------");
		Collections.sort(perlist,new SortByLastNameAge());
		iter2 = perlist.iterator();
		while(iter2.hasNext()){
			persObj2 = iter2.next();
			System.out.println(persObj2.getName()+" "+persObj2.getLastName()+" "+persObj2.getAge());
		}
	}
}