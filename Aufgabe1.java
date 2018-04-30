
public class Aufgabe1 {

	public static void main(String[] args) {
		Quadrat quadrat = new Quadrat(5);
		Rechteck rechteck = new Rechteck(5, 6);
		System.out.println("Das Quadrat hat den Umfang  " + quadrat.berechneUmfang());
		System.out.println("Fläche : " + quadrat.berechneFlaeche());
		System.out.println("Das Rechteck hat den Umfang  " + rechteck.berechneUmfang());
		System.out.println("Fläche : " + rechteck.berechneFlaeche());
	}

}

class Quadrat {
	private int length;

	public Quadrat(int length) {
		this.length = length;
	}

	protected int getLength() {
		return length;
	}

	protected void setLength(int length) {
		this.length = length;
	}

	public int berechneUmfang() {
		return this.length * 4;
	}

	public int berechneFlaeche() {
		return this.length * this.length;
	}

}

class Rechteck extends Quadrat {
	private int width;

	public Rechteck(int length, int width) {
		super(length);
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int berechneUmfang() {
		return 2 * (getLength() + width);
	}

	public int berechneFlaeche() {
		return getLength() * width;
	}

}