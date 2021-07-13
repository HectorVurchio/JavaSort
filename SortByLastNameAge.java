import java.util.Comparator;
class SortByLastNameAge implements Comparator<Person>{
	public int compare(Person p1, Person p2){
		int byLName = p1.getLastName().compareTo(p2.getLastName());
		int byAge = p1.getAge() - p2.getAge();
		return (byLName == 0) ? byAge : byLName;
	}
}