import java.util.ArrayList;
import java.util.List;

public class Aufgabe2 {

	public static void main(String[] args) {
		String text = "Jim likes Larry and Jean, but hates Kim. Bob loves Jean, and likes Larry and Kim. Jean loves Bob, likes Jim, but hates Kim. Kim hates Jim, likes Larry and Bob. Larry loves Martin, and hates Karl and Jean. ";
		String[] sentences = text.split("\\. ");
		List<Mensch> people = new ArrayList<>();
		int i = 0;
		for (String currentString : sentences) {
			Mensch neuerMensch = new Mensch(currentString.split(" ")[0]);
			people.add(neuerMensch);
		}
		for (Mensch currentMensch : people) {
			for (String currentString : sentences[people.indexOf(currentMensch)].split(",")) {
				i = 0;
				for (String currentWord : currentString.split(" ")) {
					if (currentWord != "but") {
						if (currentWord.equals("likes")) {
							currentMensch.getLikes().add(currentString.split(" ")[i + 1]);
							if (i + 2 < currentString.split(" ").length) {
								if (currentString.split(" ")[i + 2].equals("and")) {
									currentMensch.getLikes().add(currentString.split(" ")[i + 3]);
								}
							}
						} else if (currentWord.equals("hates")) {
							currentMensch.getHates().add(currentString.split(" ")[i + 1]);
							if (i + 2 < currentString.split(" ").length) {
								if (currentString.split(" ")[i + 2].equals("and")) {
									currentMensch.getHates().add(currentString.split(" ")[i + 3]);
								}
							}
						} else if (currentWord.equals("loves")) {
							currentMensch.getLoves().add(currentString.split(" ")[i + 1]);
							if (i + 2 < currentString.split(" ").length) {
								if (currentString.split(" ")[i + 2].equals("and")) {
									currentMensch.getLoves().add(currentString.split(" ")[i + 3]);
								}
							}
						}
					}
					i++;
				}
			}
		}
		for (Mensch currentPerson : people) {
			System.out.print(currentPerson.getName() + " likes: [ ");
			for (String likes : currentPerson.getLikes()) {
				System.out.print(likes + " ");
			}
			System.out.print(" ] , hates: [");
			for (String hates : currentPerson.getHates()) {
				System.out.print(hates + " ");
			}
			System.out.print(" ] , loves: [");
			for (String loves : currentPerson.getLoves()) {
				System.out.print(loves + " ");
			}
			System.out.print(" ]");
			System.out.println();
		}

	}

}

class Mensch {
	private String name;
	private List<String> likes = new ArrayList<>();
	private List<String> hates = new ArrayList<>();
	private List<String> loves = new ArrayList<>();

	public Mensch(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLikes() {
		return likes;
	}

	public void setLikes(List<String> likes) {
		this.likes = likes;
	}

	public List<String> getHates() {
		return hates;
	}

	public void setHates(List<String> hates) {
		this.hates = hates;
	}

	public List<String> getLoves() {
		return loves;
	}

	public void setLoves(List<String> loves) {
		this.loves = loves;
	}

}
