package person;

public class Person {

	private String name;
	private int age;
	private String jobTitle;

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	@Override
	public String toString() {
		return "My name is " + this.name + " and I am " + this.age + " years old. My current job title is "
				+ this.jobTitle;

	}

}
