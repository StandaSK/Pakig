package zasielky;

/**
 * List sluzi ako Leaf navrhnoveho vzoru Composite.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public class List implements Zasielka {
	private String ciel;
	private double hmotnost;

	public List() {
		// TODO Auto-generated constructor stub
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
