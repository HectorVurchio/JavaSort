import java.util.Comparator;
/**
* The SortByLastName Class runs as part of an Example application for List
* Sorting (MainPerson). this class could be considered as an instrument 
* to sort the desired list by its LastName column in ascending order.
*
* @author  Hector Jose Vurchio Hurtado
* @version 1.0
* @since   2021-07-13
* @implements Comparator Functional Interface.
*/
class SortByLastName implements Comparator<Person>{
	/**
    * This the required Comparator method to be implemented
	* @returns an int value = 0 if both LastNames are equal, 
	* less than 0 if LastName1 is < LastName2 and greater 
	* than 0 otherwise.
    */
	public int compare(Person p1, Person p2){
		return p1.getLastName().compareTo(p2.getLastName());
	}
}