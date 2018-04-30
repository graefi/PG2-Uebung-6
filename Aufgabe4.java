
public class Aufgabe4 {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("Lukas");
		Person person3 = new Person("Markus", "Söder");
	}

}

class Person {
	private String firstName;
	private String lastName;

	public Person() {
		System.out.println("Created new Person");
	}

	public Person(String firstName) {
		this.firstName = firstName;
		System.out.println("Created " + firstName);
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Created " + firstName + " " + lastName);
	}
}