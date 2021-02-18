package person;

import java.util.ArrayList;

public class PeopleList {
	private ArrayList<Person> people = new ArrayList<>();

	public Person findPersonByName(String name) {
		for (Person person : people) {
			if (person.getName() == name) {
				return person;
			}
		}
		System.out.println("Could not find the person with name: " + name);
		return null;
	}

	public void addPerson(Person person) {
		this.people.add(person);
	}

	public void removePerson(Person person) {
		this.people.remove(person);
	}

	public void returnName() {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}

}
