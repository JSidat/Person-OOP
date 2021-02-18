package person;

public class PersonApp {

	public static void main(String[] args) {

		Person person1 = new Person("Jeff", 24, "Engineer");
		Person person2 = new Person("Alex", 33, "Doctor");
		Person person3 = new Person("Jacob", 53, "Scientist");
		Person person4 = new Person("Sam", 23, "Lawyer");

		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		System.out.println(person4.toString());

		PeopleList people = new PeopleList();

		people.list.add(person1);
		people.list.add(person2);
		people.list.add(person3);
		people.list.add(person4);

		returnName(people);

	}

	public static void returnName(PeopleList people) {
		for (Person person : people.list) {
			System.out.println(person.getName());
		}
	}
}
