
public class Aufgabe5 {

	public static void main(String[] args) {
		Student tomStudent = new Student("Tom", "Teuer");
		Student reginaStudent = new Student("Regina", "Reich");
		Student leaStudent = new Student("Lea", "Lustig");
		System.out.println(leaStudent.getId());
	}

}

class Student {
	private String firstName;
	private String lastName;
	private int id;
	private static int static_id = 0;

	public Student() {
		this.firstName = "";
		this.lastName = "";
		static_id++;
		this.id = static_id;
	}

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		static_id++;
		this.id = static_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}