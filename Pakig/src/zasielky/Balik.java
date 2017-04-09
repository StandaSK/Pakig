package zasielky;

/**
 * Balik sluzi ako Leaf navrhnoveho vzoru Composite.
 * @author Stano
 *
 */
public class Balik implements Zasielka {
	private String ciel;
	private double hmotnost;

	public Balik(float hmotnost, String ciel) {
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

}
