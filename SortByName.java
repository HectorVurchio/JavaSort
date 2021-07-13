import java.util.Comparator;
/**
* The SortByName Class runs as part of an Example application for List
* Sorting (MainPerson). this class could be considered as an instrument 
* to sort the desired list by its Name column in ascending order.
*
* @author  Hector Jose Vurchio Hurtado
* @version 1.0
* @since   2021-07-13
* @implements Comparator Functional Interface.
*/
class SortByName implements Comparator<Person>{
	/**
    * This is a neither default nor static method of the Comparator
	* functional Java interface which will be used to compare the 
	* two objects Names letting them in ascending order.
	* @returns an int value = 0 if both Names are equal, less than
	* 0 if Name1 is < Name2 and greater than 0 otherwise.
    */
	public int compare(Person p1, Person p2){
		return p1.getName().compareTo(p2.getName());
	}
}