package zasielky;

/**
 * List sluzi ako Leaf navrhnoveho vzoru Composite.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class List implements Zasielka {
	private String ciel;
	private double hmotnost;

	public List(double hmotnost, String ciel) {
		this.nastavHmotnost(hmotnost);
		this.nastavCiel(ciel);
	}

	@Override
	public void nastavCiel(String ciel) {
		this.ciel = ciel;
	}

	@Override
	public String zistiCiel() {
		return ciel;
	}

	@Override
	public void nastavHmotnost(double hmotnost) {
		this.hmotnost = hmotnost;
	}

	@Override
	public double zistiHmotnost() {
		return hmotnost;
	}

	@Override
	public String getNazovTriedy() {
		return "List";
	}
	
}
